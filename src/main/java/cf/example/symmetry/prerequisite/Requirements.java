package cf.example.symmetry.prerequisite;

import cf.example.symmetry.exceptions.ReadRequirementException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Requirements {

    public static List<Requirement<Character, Character>> getRule() {
        List<Requirement<Character, Character>> requirements = new ArrayList<>();
        InputStream file = Requirements.class
                .getClassLoader()
                .getResourceAsStream("rules.txt");

        String rule;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(file, StandardCharsets.UTF_8))) {


            while ((rule = br.readLine()) != null) {
                    Requirement<Character, Character> requirement = new Requirement<>(rule.charAt(0), rule.charAt(1));
                    requirements.add(requirement);
            }

        } catch (NullPointerException | IOException e) {
            throw new ReadRequirementException("The file could not be opened!", e);
        }
        return requirements;
    }


}
















