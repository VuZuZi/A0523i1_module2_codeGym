package ss2_loop_on_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("---Menu---");
            System.out.println("1 - Print the rectangle\n" +
                    "\n" +
                    "2 - Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "\n" +
                    "3 - Print isosceles triangle\n" +
                    "\n" +
                    "4 - Exit\n"
                    );
            System.out.print("Your option: "); int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Vị trí góc vuông");
                    System.out.println("1 - trái");
                    System.out.println("2 - phải");
                    System.out.println("2 - dưới trái");
                    System.out.println("4 - dưới phải");
                    int opp = sc.nextInt();
                    switch (opp){
                        case 1:
                            for (int i = 0; i < 6; i++) {
                                for (int j = i; j < 5; j++) {
                                    System.out.print(" * ");
                                }
                                for (int j = 0; j < i; j++) {
                                    System.out.print("   ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("   ");
                                }
                                for (int j = i; j < 5; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }

//                            System.out.println("*********");
//                            System.out.println("  *******");
//                            System.out.println("    *****");
//                            System.out.println("      ***");
//                            System.out.println("        *");
                            break;
                        case 3:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j <= i ; j++) {
                                    System.out.print(" * ");
                                }
                                for (int j = 6; j > i ; j--) {
                                    System.out.print("   ");
                                }
                                System.out.println();
                            }
//                            System.out.println("* ");
//                            System.out.println("*** ");
//                            System.out.println("***** ");
//                            System.out.println("*******");
//                            System.out.println("*********");
                            break;
                        case 4:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 6; j > i ; j--) {
                                    System.out.print("   ");
                                }
                                for (int j = 0; j <= i ; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }

//                            System.out.println("        *");
//                            System.out.println("      ***");
//                            System.out.println("    *****");
//                            System.out.println("  *******");
//                            System.out.println("*********");
                            break;
                        default:
                            System.out.println("---");
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i ; j--) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < (i*2)+1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
//                    System.out.println("        *    ");
//                    System.out.println("      *****  ");
//                    System.out.println("    *********    ");
//                    System.out.println("  *************    ");
//                    System.out.println("*****************  ");
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("----");
            }
        }while (check);
    }
}
