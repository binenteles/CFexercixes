package cf.example.symmetry.algorithms;

import cf.example.symmetry.conditions.Base;
import cf.example.symmetry.template.Evaluator;
import cf.example.symmetry.conditions.Requirements;

import java.util.stream.Stream;

public class ForBased extends Evaluator {

    @Override
    public boolean isStringSymmetric(String str) {
        boolean anyMatch = false;

        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            anyMatch = getStream().
                    anyMatch(base -> base.getLeft() == start && base.getRight() == end);
        }

        return anyMatch;
    }

    private Stream<Base<Character, Character>> getStream() {
        return Requirements.getRule().stream();
    }


}
