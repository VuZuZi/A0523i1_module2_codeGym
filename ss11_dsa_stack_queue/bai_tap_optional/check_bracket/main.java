package ss11_dsa_stack_queue.bai_tap_optional.check_bracket;

import java.util.Stack;

public class main {

    public static void main(String[] args) {
        bracketCheck bracketCheck = new bracketCheck();
        System.out.println(bracketCheck.isCheck("(s – a)(s – b)"));
        System.out.println(bracketCheck.isCheck("s * (s – a) * (s – b) * (s – c) "));
        System.out.println(bracketCheck.isCheck("(– b + (b2 – 4*a*c)^0.5) / 2*a "));
        System.out.println(bracketCheck.isCheck("s * (s – a) * (s – b * (s – c)  "));
        System.out.println(bracketCheck.isCheck("s * (s – a) * s – b) * (s – c)  "));
        System.out.println(bracketCheck.isCheck("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"));
    }
}
