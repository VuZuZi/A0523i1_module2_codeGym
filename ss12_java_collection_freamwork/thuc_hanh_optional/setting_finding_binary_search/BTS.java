package ss12_java_collection_freamwork.thuc_hanh_optional.setting_finding_binary_search;

public class BTS <E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BTS() {
    }

    public BTS(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null; // nút cha của current
            TreeNode<E> current = root; // nút hiện tại
            while (current != null){//duyệt cây tìm vị trí chèn phù hợp
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }else {
                    return false; // cây không thể chưa 2 node giống nhau
                }
            }
            // sau khi duyệt so sánh với node hiện tại xem nên chèn vào trái hay phải của cây
            if (e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            }else {
                parent.right = createNewNode(e);
            }
        }
        size++;// sau khi chèn tăng kích thước của cây lên 1
        return true;

    }

    private TreeNode<E> createNewNode(E e) {
        TreeNode<E> newNode = new TreeNode<>(e);
        return newNode;
    }

    @Override
    public int getSize() {
        return size;
    }
    public void inorder(){
    }
    protected void inorder(TreeNode<E> root){
        if (root == null)return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
