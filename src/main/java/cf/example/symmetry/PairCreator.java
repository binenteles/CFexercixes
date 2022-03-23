package cf.example.symmetry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairCreator {

    public static List<Pair<Character, Character>> getRulePairs() {
        List<Pair<Character, Character>> pairsToCheck = new ArrayList<>();
        InputStream file = PairCreator.class.getClassLoader().getResourceAsStream("pairs.txt");
        Scanner scanner = new Scanner(file);
        String rule = scanner.nextLine();

        for (int i = 0; i < rule.length(); i += 2) {
            Pair pair = new Pair<>(rule.charAt(i), rule.charAt(i + 1));
            pairsToCheck.add(pair);
        }
        return pairsToCheck;
    }


}
