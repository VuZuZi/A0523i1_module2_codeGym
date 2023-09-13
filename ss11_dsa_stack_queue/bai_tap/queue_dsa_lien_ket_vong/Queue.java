package ss11_dsa_stack_queue.bai_tap.queue_dsa_lien_ket_vong;

public class Queue implements ISolution{
    public Node front;//phần tử được đưa vào đầu tiên trong hàng đợi
    public Node rear;//phần tử được đưa vào cuối cùng trong hàng đợi

    public Queue() {
        front = null;
        rear = null;
    }


    @Override
    public void enQueue(int key) {
        Node n = new Node(key);
        if(rear==null){
            front = rear = n;
        }else {
            rear.link = n;
            rear=n;
        }
    }

    @Override
    public void deQueue() {//deQueue là hàm thực hiện lấy ra 1 phần tử.Trong hàng đợi liên kết vòng, luôn lấy ra vị trị Front.
        if (front == null){
            System.out.println("rỗng");
        }else {
            System.out.println(this.front.data);
        }
    }

    @Override
    public void displayQueue() {

    }
}
