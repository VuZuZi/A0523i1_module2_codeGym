package ss11_dsa_stack_queue.bai_tap_optional.check_bracket;

import java.util.Stack;

public class bracketCheck {
    private Stack<Character> bStack;
    private String str;
    private boolean check = true;

    public bracketCheck() {

    }
    public boolean isCheck(String str){
        bStack = new Stack<>();
        int size = str.length();
        for (int i = 0; i < size; i++) {
            char sym = str.charAt(i);
            if (str.charAt(i) == '('  || str.charAt(i) == ')'){
                if (str.charAt(i) == '('){
                    bStack.push('(');
                }else {
                    if (bStack.isEmpty()){
                        check = false;
                        return false;
                    }else {
                        bStack.pop();
                    }
                }
            }
          }
        if (!bStack.isEmpty()){
            check = false;
        }
        return check;
    }

}
