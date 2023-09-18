package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static int option(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+" - "+arr[i]);
        }
        System.out.println((arr.length+1)+" - Exit");
        int op;
        System.out.print("Your option: ");
        op = Integer.parseInt(sc.nextLine());
        System.out.println("-----------");
        return op;
    }
}
