package cf.example.symmetry;

public class SymmetryWithWhile {

    int i = 0;
    boolean isSymmetric = true;

    public boolean isSymmetricBalanced(String str) {
        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }
        int j = arr.length - 1;

        while (i < j) {
            char current = arr[i];
            char compare = arr[j];

            if (current == '(') {
                if (compare != ')') {
                    isSymmetric = false;
                }
            } else if (current == '[') {
                if (compare != ']') {
                    isSymmetric = false;
                }
            } else if (current == '{') {
                if (compare != '}') {
                    isSymmetric = false;
                }
            } else {
                isSymmetric = false;
            }
            i++;
            j--;
        }
        return isSymmetric;
    }

}
