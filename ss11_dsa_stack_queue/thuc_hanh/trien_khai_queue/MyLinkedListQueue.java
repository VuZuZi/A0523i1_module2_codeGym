package ss11_dsa_stack_queue.thuc_hanh.trien_khai_queue;

import java.util.LinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
//        LinkedList
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = temp;
        }else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }
    // lấy phần tử ở đầu tiên
    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        return temp;
    }
}