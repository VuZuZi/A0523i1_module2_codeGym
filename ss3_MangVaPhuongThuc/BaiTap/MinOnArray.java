package ss3_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class MinOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr["+(i+1)+"] : ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr["+(i+1)+"]: "+arr[i]);

            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min: "+min);
    }
}
