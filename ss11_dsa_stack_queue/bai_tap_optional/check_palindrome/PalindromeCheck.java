package ss11_dsa_stack_queue.bai_tap_optional.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    private String strInpur;


    private Queue<Character> queue;
    private Stack<Character> stack;

    public PalindromeCheck() {
        this.queue = new LinkedList<Character>();
        this.stack = new Stack<>();
    }

    public void addC(String str) {
        strInpur = str.toLowerCase();
//        System.out.println("str input: "+strInpur);
        for (int i = 0; i < str.length(); i++) {
            if (strInpur.charAt(i) >= 'a' && strInpur.charAt(i) <= 'z') {
                queue.add(strInpur.charAt(i));
                stack.add(strInpur.charAt(i));
            }else {
//                System.out.println(strInpur.charAt(i)+"err");
                continue;
            }
        }
        System.out.println("queue: "+queue);
    }

    public boolean check() {
        boolean check = true;
        while (queue.isEmpty()){
            if (stack.pop() != queue.poll()){
                check = false;
                return check;
            }
        }
        return check;
    }

    public void checkPalindrome(String str){
        addC(str);
        System.out.println(strInpur +" là 1 chuỗi Palindrome: "+check());
    }
}
