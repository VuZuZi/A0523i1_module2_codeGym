package ss3_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class AddPtuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " +arr[i]);
        }
        int indexAdd;
        System.out.println(arr.length);
        do {
            System.out.print("Nhập vị trí add: ");
            indexAdd = sc.nextInt();
            break;
        }while (true);


        System.out.print("Nhập giá trị add: ");
        int newValue = sc.nextInt();
        int[] arrNew = new int[10];
        for (int i = 0; i < indexAdd; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[indexAdd] = newValue;
        for (int i = indexAdd+1; i < arr.length; i++) {
            arrNew[i] = arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " +arrNew[i]);
        }
    }
}
