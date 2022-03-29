package cf.example.symmetry.requirements;

public class Requirement<T>  {
    private final T leftChar;
    private final T rightChar;

    public Requirement(T leftChar, T rightChar) {
        this.leftChar = leftChar;
        this.rightChar = rightChar;
    }

    public T getLeftChar() {
        return leftChar;
    }

    public T getRightChar() {
        return rightChar;
    }

    @Override
    public String toString() {
        return "Requirement{" +
                "left=" + leftChar +
                ", right=" + rightChar +
                '}';
    }



    public boolean compareChars(char left, char right) {
       return getLeftChar() == leftChar && getRightChar() == rightChar;
    }
}
