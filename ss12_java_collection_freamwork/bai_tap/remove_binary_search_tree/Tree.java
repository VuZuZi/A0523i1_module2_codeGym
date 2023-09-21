package ss12_java_collection_freamwork.bai_tap.remove_binary_search_tree;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();

    void postorder();
    int getSize();
}
