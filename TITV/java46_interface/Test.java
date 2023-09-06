package TITV.java46_interface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("b: ");
        double b = Double.parseDouble(sc.nextLine());
        IMayTinhBoTui m1 = new MayTinhCasioFX500();
        IMayTinhBoTui m2 = new MayTinhVinacal500();
        System.out.println(m1.cong(a,b));
        System.out.println(m2.cong(7,b));
    }
}
