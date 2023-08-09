package ss2_LoopOnJava.ThucHanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số A: ");int numA = sc.nextInt();
        System.out.print("Nhập số B: ");int numB = sc.nextInt();
        int a = numA, b= numB;
        if (numA == 0 || numB == 0){
            System.out.println("Không có UCLN");
        }else if (numA == numB){
            System.out.println("UCLN: "+numA);
        }else {
            while (numA != numB){
                int r = numA % numB;
                numA = numB;
                numB = r;
                if (numB == 0){
                    break;
                }
            }
            System.out.println("UCLN của "+a+" và "+b+" là "+numA);

        }
    }
}
