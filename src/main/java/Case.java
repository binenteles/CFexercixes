public class Case {
    public static boolean isSymmetricBalanced(String str) {
        char[] arr = str.toCharArray();
        if (arr.length % 2 != 0) {
            return false;
        }

        int i = 0;
        int j = arr.length - 1;
        boolean isSymmetric = true;

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

    public static void main(String[] args) {
        System.out.println(isSymmetricBalanced("([{{[(())]}}])"));
        System.out.println(isSymmetricBalanced("{{[]()}}}}"));
        System.out.println(isSymmetricBalanced("{[(])}"));
        System.out.println(isSymmetricBalanced("[](){}"));
    }
}
