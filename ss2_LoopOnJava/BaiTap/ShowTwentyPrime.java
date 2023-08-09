package ss2_LoopOnJava.BaiTap;

import java.util.Scanner;

public class ShowTwentyPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bao nhiêu số nguyên tố cần hiển thị: ");
        int num = sc.nextInt();
        int count = 0;
        int i = 2;
        while (count < num){
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                count++;
                System.out.println(count + ": " +i);
            }
            i++;
        }
    }
}
