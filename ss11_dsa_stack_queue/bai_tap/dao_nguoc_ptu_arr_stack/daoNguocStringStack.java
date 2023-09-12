package ss11_dsa_stack_queue.bai_tap.dao_nguoc_ptu_arr_stack;

import java.lang.reflect.Array;
import java.util.Stack;

public class daoNguocStringStack {
    protected Stack<String> wStack = new Stack<>();

    public daoNguocStringStack() {
        wStack = new Stack<>();
    }
    public void pushString(String s1){
        String[] s2 = s1.split(" ");
        for (int i = 0; i < s2.length; i++) {
            wStack.push(s2[i]);
        }
    }
    public void daoNguoc(){
        Stack<String> nWord = new Stack<>();
        while (!wStack.isEmpty()){
            nWord.push(wStack.pop());
        }
        wStack = nWord;
    }
    public void printAndDelete(){
        System.out.print("All in Stack: ");
        while (!wStack.isEmpty()){
            System.out.print(wStack.pop()+" ");
        }
    }
}
