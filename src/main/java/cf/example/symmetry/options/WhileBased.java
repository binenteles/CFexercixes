package cf.example.symmetry.options;

import cf.example.symmetry.prerequisite.Requirement;
import cf.example.symmetry.prerequisite.Evaluator;
import cf.example.symmetry.prerequisite.Requirements;

import java.util.stream.Stream;

public class WhileBased extends Evaluator {


    @Override
    public boolean isStringSymmetric(String str) {

        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char start = arr[i];
            char end = arr[j];
            boolean any = getStream()
                    .anyMatch(base -> base.getLeft() == start && base.getRight() == end);
            i++;
            j--;
            if (!any) {
                return false;
            }

        }
        return true;
    }

    private Stream<Requirement<Character, Character>> getStream() {
        return Requirements.getRule().stream();
    }


}
