package ss12_java_collection_freamwork.bai_tap.binary_search_preorder;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();

    void postorder();
    int getSize();
}
