package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "cautruclapdaskdgiu Sdukjsr gvyegs jhsgyrg";
        String strF = str.toLowerCase();
        System.out.print("nhập ký tự muốn kiểm tra(chỉ tính ký tự đàu tiên): ");
        String c = sc.nextLine();
        char ch = c.charAt(0);
        int count = 0;
        for (int i = 0; i < strF.length(); i++) {
            if (ch == strF.charAt(i)){
                count++;
            }
        }
        System.out.println("Ký tự: "+ch+" xuất hiện trong ("+str+") "+count+" lần");
    }
}
