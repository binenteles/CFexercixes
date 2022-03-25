package cf.example.symmetry.conditions;

public class Base<E, T> {
    private E left;
    private T right;

    public Base(E left, T right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

}
