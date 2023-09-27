package ss15_exeption_debug.practive.su_dung_lop_ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class CaculatorExample {
    private void caculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");int x = sc.nextInt();
        System.out.print("\ny: ");int y = sc.nextInt();
        CaculatorExample example = new CaculatorExample();
        example.caculate(x,y);

    }
}
