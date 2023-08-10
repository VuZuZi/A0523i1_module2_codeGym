package ss3_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class SumColOnArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.print("Nhập cột muốn tính: ");
        int col = sc.nextInt() - 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("Sum: "+ sum);
    }
}
