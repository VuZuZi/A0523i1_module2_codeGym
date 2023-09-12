package ss11_dsa_stack_queue.thuc_hanh.trien_khai_queue;

public class main {
    public static void main(String[] args) {
        MyLinkedListQueue listQueue = new MyLinkedListQueue();
        listQueue.enqueue(1);
        listQueue.enqueue(2);
        listQueue.enqueue(3);
        listQueue.enqueue(4);
        listQueue.dequeue();
        listQueue.dequeue();
        listQueue.dequeue();
        listQueue.enqueue(30);
        listQueue.enqueue(40);
        listQueue.enqueue(50);
        System.out.println("Dequeued item is " + listQueue.dequeue().key);
    }
}
