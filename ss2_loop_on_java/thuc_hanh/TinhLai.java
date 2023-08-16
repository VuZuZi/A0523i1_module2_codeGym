package ss2_loop_on_java.thuc_hanh;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: "); double money = sc.nextDouble();
        System.out.print("Nhập lãi suất hàng năm(%): ");double interest = sc.nextDouble();
        System.out.print("Nhập kì hanh gửi(tháng): ");int month = sc.nextInt();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interest/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi "+totalInterest);
    }
}
