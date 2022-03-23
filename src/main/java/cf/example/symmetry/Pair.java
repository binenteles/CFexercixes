package cf.example.symmetry;

public class Pair<E, T> {
    private E left;
    private T right;

    public Pair(E left, T right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }


}
