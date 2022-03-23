package cf.example.symmetry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PairCreator {

    public static List<Pair<Character, Character>> getRulePairs()  {
        List<Pair<Character, Character>> pairsToCheck = new ArrayList<>();
        InputStream file = PairCreator.class
                .getClassLoader()
                .getResourceAsStream("pairs.txt");

        String rule;

        try {
            assert file != null;
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(file, StandardCharsets.UTF_8))) {


                while ((rule = br.readLine()) != null) {
                    for (int i = 0; i < rule.length(); i += 2) {
                        Pair<Character, Character> pair = new Pair<>(rule.charAt(i), rule.charAt(i + 1));
                        pairsToCheck.add(pair);
                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pairsToCheck;
    }
}
















