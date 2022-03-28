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
                .getResourceAsStream("C:\\Users\\Alexandru\\IdeaProjects\\Problema\\src\\test\\resources\\rules.txt");

        String get;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(file, StandardCharsets.UTF_8))) {


            while ((get = br.readLine()) != null) {
                    Requirement<Character, Character> requirement = new Requirement<>(get.charAt(0), get.charAt(1));
                    requirements.add(requirement);
            }

        } catch (NullPointerException | IOException e) {
            throw new ReadRequirementException("The file could not be opened!", e);
        }
        return requirements;
    }




}
















