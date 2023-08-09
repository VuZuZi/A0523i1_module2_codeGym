package ss1_IntroductionToJava.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {

    public static String soNho(int number) {
        String read = null;
        switch (number) {
            case 0:
                read = "Zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "night";
                break;
            case 10:
                read = "ten";
                break;
            
        }return read;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        String read ;
        if (number<=10){
            switch (number){
                case 0:
                    read = "Zero";
                    break;
                case 1:
                    read = "one";
                    System.out.println("one");
                    break;
                case 2:
                    read = "two";
                    System.out.println("two");
                    break;
                case 3:
                    read = "three";
                    System.out.println("three");
                    break;
                case 4:
                    read = "four";
                    System.out.println("four");
                    break;
                case 5:
                    read = "five";
                    System.out.println("five");
                    break;
                case 6:
                    read = "six";
                    System.out.println("six");
                    break;
                case 7:
                    read = "seven";
                    System.out.println("seven");
                    break;
                case 8:
                    read = "eight";
                    System.out.println("eight");
                    break;
                case 9:
                    read = "night";
                    System.out.println("night");
                    break;
                case 10:
                    read = "ten";
                    System.out.println("ten");
                    break;

            }
        } else  {
            
        }
    }
}
