package ss12_java_collection_freamwork.thuc_hanh_optional.setting_finding_binary_search;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();

    int getSize();
}
