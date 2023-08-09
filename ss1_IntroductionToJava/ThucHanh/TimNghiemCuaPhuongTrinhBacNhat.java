package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class TimNghiemCuaPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất có dạng Ax + B = C");
        System.out.print("Nhập A: "); double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập B: "); double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập c: "); double c = Double.parseDouble(sc.nextLine());
        System.out.println(a+"x + "+b+" = "+ c);
        if (a != 0){
            double x = (c-b)/a;
            System.out.println("x = " + x);
        }else {
            if (b == c) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Không có nghiệm");
            }
        }
    }
}
