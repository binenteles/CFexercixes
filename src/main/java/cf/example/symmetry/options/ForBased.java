package cf.example.symmetry.options;

import cf.example.symmetry.prerequisite.Requirement;
import cf.example.symmetry.Evaluator;
import cf.example.symmetry.prerequisite.Requirements;

import java.util.stream.Stream;

public class ForBased extends Evaluator {

    @Override
    public boolean isSymmetric(String str) {
        boolean anyMatch = false;

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            anyMatch = getStream().
                    anyMatch(base -> base.getLeft() == start && base.getRight() == end);
        }

        return anyMatch;
    }

    private Stream<Requirement<Character, Character>> getStream() {
        return Requirements.getRule().stream();
    }


}
