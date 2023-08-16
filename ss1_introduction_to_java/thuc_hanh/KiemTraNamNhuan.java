package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.print("Nhập năm muốn kiểm tra: ");
            year = Integer.parseInt(sc.nextLine());
            if (year >= 1){
                break;
            }
        }while (true);

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " là năm nhuận");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " là năm nhuận");
        }else {
            System.out.println(year + " không phải là năm nhuận");
        }

    }
}
