package cf.example.symmetry.requirements;

import cf.example.symmetry.exceptions.ReadRequirementException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Requirements {

    public static List<Requirement<Character>> getRule() {
        List<Requirement<Character>> requirements = new ArrayList<>();
        Path filePath = Paths.get("src/test/resources/rules.txt");

        try {
            String content = Files.readString(filePath);
            String[] lines = content.split("\\R");
            List<Requirement> requirementList = Arrays.stream(lines)
                    .map(requirement -> new Requirement<>(requirement.charAt(0), requirement.charAt(1))).collect(Collectors.toList());
            for (Requirement<Character> requirement : requirementList) {
                requirements.add(requirement);
            }

        } catch (NullPointerException | IOException e) {
            throw new ReadRequirementException("The file could not be opened!", e);
        }
        return requirements;
    }

    public static boolean compareStartEndCharacters(char start, char end) {
        return Requirements.getRule().stream()
                .anyMatch(requirement -> requirement.compareChars(start, end));
    }


}
















