package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,weight;
        System.out.print("Nhập chiều dài của hcn: ");
        height = Double.parseDouble(sc.nextLine());
        System.out.println();
        System.out.print("nhập chiều rộng của hcn: ");
        weight = Double.parseDouble(sc.nextLine());
        double s = height * weight;
        System.out.println("diện tích của hcn có chiều dài = "+height+" chiều rộng "+weight+" Diện tích: "+s);
    }
}
