package cf.example.symmetry.conditions;

import cf.example.symmetry.exceptions.CustomException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Requirements {

    public static List<Base<Character, Character>> getRule() {
        List<Base<Character, Character>> baseList = new ArrayList<>();
        InputStream file = Requirements.class
                .getClassLoader()
                .getResourceAsStream("pairs.txt");

        String rule;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(file, StandardCharsets.UTF_8))) {


            while ((rule = br.readLine()) != null) {
                for (int i = 0; i < rule.length(); i += 2) {
                    Base<Character, Character> base = new Base<>(rule.charAt(i), rule.charAt(i + 1));
                    baseList.add(base);

                }
            }

        } catch (NullPointerException | IOException e) {
            throw new CustomException("The file could not be opened!", e);
        }
        return baseList;
    }


}
















