package ss11_dsa_stack_queue.bai_tap.dao_nguoc_ptu_arr_stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        daoNguocKieuSo n1 = new daoNguocKieuSo();
        n1.add(6);
        n1.add(5);
        n1.add(4);
        n1.add(3);
        n1.add(2);
        n1.add(1);
//        n1.daoNguoc();
//        n1.printAndDelete();
//        n1.printAndDelete();

        daoNguocStringStack s1 = new daoNguocStringStack();
        s1.pushString("tran tuan vu mua xuan ha noi");
        s1.daoNguoc();
        s1.printAndDelete();
    }
}
