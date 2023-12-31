package ss11_dsa_stack_queue.thuc_hanh.stack_linked_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGeneticStack<T>{
    private LinkedList<T> stack;

    public MyGeneticStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}
