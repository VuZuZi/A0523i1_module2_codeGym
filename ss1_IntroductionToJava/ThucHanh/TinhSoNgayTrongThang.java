package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng muốn tính: "); int month = sc.nextInt();
        String daysInMonth;
        switch (month){
//            case 1:
//                System.out.println("Tháng 1 có 31 ngày");
//                break;
//            case 3:
//                System.out.println("Tháng 3 có 31 ngày");
//                break;
//            case 5:
//                System.out.println("Tháng 5 có 31 ngày");
//                break;
//            case 7:
//                System.out.println("Tháng 7 có 31 ngày");
//                break;
//            case 8:
//                System.out.println("Tháng 8 có 31 ngày");
//                break;
//            case 10:
//                System.out.println("Tháng 10 có 31 ngày");
//                break;
//            case 12:
//                System.out.println("Tháng 12 có 31 ngày");
//                break;
//            case 2:
//                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
//                break;
//            case 4:
//                System.out.println("Tháng 4 có 30 ngày");
//                break;
//            case 6:
//                System.out.println("Tháng 6 có 30 ngày");
//                break;
//            case 9:
//                System.out.println("Tháng 9 có 30 ngày");
//                break;
//            case 11:
//                System.out.println("Tháng 11 có 30 ngày");
//                break;
//            default:
//                System.out.println("lỗi");


            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");


        
    }
}
