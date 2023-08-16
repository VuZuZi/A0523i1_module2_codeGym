package ss3_mang_va_phuong_thuc.bai_tap;

public class SumDiagonalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,2,4,6},
                {1,3,6,1},
                {7,9,0,2}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //tính tổng đường chéo
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum: "+sum);

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length-1){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("Sum2: "+sum2);
    }
}
