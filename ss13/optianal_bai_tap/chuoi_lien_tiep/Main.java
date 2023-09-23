package ss13.optianal_bai_tap.chuoi_lien_tiep;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String str = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> subList = new LinkedList<>();
            subList.add(str.charAt(i));
            for (int j = i+1; j < str.length(); j++) {
//                if (str.charAt(i) > subList.getLast()){
                if (subList.getLast() < str.charAt(j)){
                    subList.add(str.charAt(j));
                }
            }
            if (list.size() < subList.size()){
                list.clear();
                list.addAll(subList);
            }

        }
        for (Character c:list
        ) {
            System.out.print(c+" ");
        }
    }
}
