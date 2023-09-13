package ss11_dsa_stack_queue.thuc_hanh.stack_array;

public class MyStack {
    public int arr[];
    public int size;//lưu số phần tử trong stack
    public int index = 0;// xác định vị trí của từng phần tử trong stack

    public MyStack(int size) {
        this.size = size;
        arr =new int[size];
    }
    public void push(int num){
        if (isFull()){
            throw new StackOverflowError("hàng đợi stack đầy");
        }else {
            arr[index] = num;
            index++;
        }
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("hàng đợi stack rỗng");
        }
        return arr[--index];
    }

    boolean isEmpty() {
        boolean status = false;
        if (index == 0) status = true;
        return status;
    }

    private boolean isFull() {
        boolean status = false;
        if (index == size){
            status = true;
        }
        return status;
    }
    public int size(){
        return index;
    }
}
