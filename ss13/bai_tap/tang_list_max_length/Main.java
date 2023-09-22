package ss13.bai_tap.tang_list_max_length;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: "); String str = sc.nextLine();

        LinkedList<Character> listFirst = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> listSub = new LinkedList<>();
            listSub.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)>listSub.getLast()){
                    listSub.add(str.charAt(j));
                }
            }
            if (listSub.size() > listFirst.size()){
                listFirst.clear();
                listFirst.addAll(listSub);
            }
            listSub.clear();
        }
        for (Character c:listFirst
             ) {
            System.out.print(c+" ");
        }
    }
}
