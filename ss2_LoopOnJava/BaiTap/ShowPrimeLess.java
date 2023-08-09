package ss2_LoopOnJava.BaiTap;

import java.util.Scanner;

public class ShowPrimeLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int i = 2;
        while (true){
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
            if (i >= 100){
                break;
            }
        }
    }
}
