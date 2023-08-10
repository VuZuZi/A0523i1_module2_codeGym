package ss3_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class MaxOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iMax = 0, jMax = 0;
        System.out.print("Nhập chiều rộng của ma trận: ");
        int weight = sc.nextInt();
        System.out.print("Nhập chiều cao của ma trận: ");
        int height = sc.nextInt();
        int[][] arr = new int[height][weight];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("Array["+i+"]["+j+"]: ");
                arr[i][j]= sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                    iMax = i;
                    jMax = j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max Arr["+iMax+"]["+jMax+"]: "+max);
    }
}
