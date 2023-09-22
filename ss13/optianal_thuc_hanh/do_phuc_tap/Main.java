package ss13.optianal_thuc_hanh.do_phuc_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] countChar = new int[255];

        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            countChar[ascii]++;
        }
        int max = 0;
        char charactor = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (countChar[i] > max) {
                max = countChar[i];
                charactor = (char) i;
            }
        }
        System.out.println("ký tự: "+charactor+" xuất hiện "+max+" lần");
    }
}
