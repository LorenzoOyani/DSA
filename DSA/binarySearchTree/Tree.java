package DSA.binarySearchTree;

public interface Tree<E> extends Iterable<E> {
    boolean search(E object);

    boolean insert(E object); // takes care of creating the object in the heap

    boolean delete(E object);

    boolean Empty();

    void preOrder();

    void postOrder();

    void inOrder();

    int getSize();

    void clear();


}
