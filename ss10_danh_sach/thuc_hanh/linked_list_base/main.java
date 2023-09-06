package ss10_danh_sach.thuc_hanh.linked_list_base;

public class main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(11);
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.addFirst(15);

        list.add(3,5);
        list.add(3,6);

        list.printList();
    }
}
