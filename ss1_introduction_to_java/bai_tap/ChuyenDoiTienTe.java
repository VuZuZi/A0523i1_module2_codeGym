package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        System.out.print("Nhập số tiền $: ");double dola = sc.nextDouble();
        double vnd = dola*rate;
        System.out.println("$"+dola+" = "+vnd+"vnd");
    }
}
