package cf.example.symmetry.requirements;

import cf.example.symmetry.exceptions.ReadRequirementException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Requirements {

    public static List<Requirement<Character>> readRequirementPairs() {
        List<Requirement<Character>> requirements;
        Path filePath = Paths.get("src/test/resources/rules.txt");

        try {
            String content = Files.readString(filePath);
            String[] lines = content.split("\\R");
            requirements = Arrays.stream(lines)
                    .map(requirement -> new Requirement<>(requirement.charAt(0), requirement.charAt(1))).collect(Collectors.toList());

        } catch (NullPointerException | IOException e) {
            throw new ReadRequirementException("The file could not be opened!", e);
        }
        return requirements;
    }

    public static boolean matchCharactersWithRequirementPair(char left, char right) {
        return Requirements.readRequirementPairs().stream()
                .noneMatch(requirement -> requirement.compareChars(left, right));
    }


}
















