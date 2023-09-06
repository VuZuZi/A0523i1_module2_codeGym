package ss10_danh_sach.bai_tap.trien_khai_method_linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNode++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNode++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node holder = temp.next.next;
        temp.next = holder;
    }

    public void remove(Object o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next == o) {
                temp.next = temp.next.next;
                break;
            }
        }
    }

    public int size() {
        return numNode;
    }

    public void printList() {
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp);
        }
    }
    public MyLinkedList clone(){
        return null;
    }
    public boolean contains(E e){
        Node nodeCheck = new Node(e);
        Node temp = head;
        while (temp.next!=null){
            if (temp == nodeCheck){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        Node temp = head;
        Node nodeCheck = new Node(e);
        int index = 0;
        while (temp.next!=null){
            if (temp == nodeCheck){
                return index;
            }
            index++;
        }
        return -1;
    }
}
