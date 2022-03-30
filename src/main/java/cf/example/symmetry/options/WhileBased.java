package cf.example.symmetry.options;

import cf.example.symmetry.Evaluator;
import cf.example.symmetry.requirements.Requirements;

public class WhileBased extends Evaluator {


    @Override
    public boolean isSymmetric(String str) {

        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char start = arr[i];
            char end = arr[j];
            boolean any = Requirements.getRule().stream()
                    .anyMatch(requirement -> requirement.compareChars(start, end));
            i++;
            j--;
            if (!any) {
                return false;
            }

        }
        return true;
    }


}
