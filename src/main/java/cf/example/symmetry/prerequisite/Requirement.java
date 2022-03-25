package cf.example.symmetry.prerequisite;

public class Requirement<E, T> {
    private E left;
    private T right;

    public Requirement(E left, T right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Base{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
