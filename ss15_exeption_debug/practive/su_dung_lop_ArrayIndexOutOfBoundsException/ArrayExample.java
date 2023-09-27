package ss15_exeption_debug.practive.su_dung_lop_ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.print("danh sach ptu chua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        }catch (Exception e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
