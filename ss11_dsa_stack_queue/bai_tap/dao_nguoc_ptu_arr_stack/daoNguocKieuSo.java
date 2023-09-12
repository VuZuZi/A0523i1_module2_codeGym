package ss11_dsa_stack_queue.bai_tap.dao_nguoc_ptu_arr_stack;

import java.util.Stack;

public class daoNguocKieuSo {
    public Stack<Integer> nStack;
    public daoNguocKieuSo() {
        nStack = new Stack<>();
    }
    public void add(int n){
        nStack.push(n);
    }
    public Stack<Integer> daoNguoc(){
        Stack<Integer> newStack = new Stack<>();
        while (!nStack.isEmpty()){
            newStack.push( nStack.pop());
        }
        return nStack = newStack;
    }
    public void printAndDelete(){
        while (!nStack.isEmpty()){
            System.out.println(nStack.pop());
        }
    }
}
