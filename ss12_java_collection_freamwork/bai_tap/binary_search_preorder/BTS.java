package ss12_java_collection_freamwork.bai_tap.binary_search_preorder;

public class BTS<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BTS() {
    }

    public BTS(E[] list) {
        for (int i = 0; i < list.length; i++) {
            insert(list[i]);
        }
    }


    @Override
    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){ //tìm đến vị trí chèn
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }
            }
            //chèn left or right
            if (e.compareTo(parent.element)<0){
                parent.left = createNewNode(e);
            }else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if (root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }

    private void inorder(TreeNode<E> root) {
        if (root == null)return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
