package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {0,1,2,3,4,4,5,6,7};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " "+a[i]);
        }
        System.out.print("Nhập phần tử muốn xoá: ");
        int delN = sc.nextInt();
        int indexDel = -1;
        for (int i = 0; i < a.length; i++) {
            if (delN == a[i]){
                indexDel = i;
            }
        }
        if (indexDel == -1){
            System.out.println("Không tìm thấy phần tử "+delN);
        }else {
            int[] newA = new int[a.length-1];
            for (int i = 0; i < a.length; i++) {
                if(i == indexDel){
                    break;
                }
                newA[i] = a[i];
            }
            for (int i = indexDel; i < a.length-1; i++) {
                newA[i] = a[i+1];
            }
            for (int i = 0; i < newA.length; i++) {
                System.out.println(i + " "+newA[i]);
            }
        }
    }
}
