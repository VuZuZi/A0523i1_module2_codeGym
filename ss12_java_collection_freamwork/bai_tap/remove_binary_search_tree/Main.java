package ss12_java_collection_freamwork.bai_tap.remove_binary_search_tree;


public class Main {
    public static void main(String[] args) {
        BTS<Integer> tree = new BTS<>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(8);
        tree.insert(1);

        tree.remove(1);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
