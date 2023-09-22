package ss13.optianal_bai_tap.finding_binary_search;

import java.util.Scanner;

public class Main {
    static int search(int[] list, int value) {
        int high = list.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (value == list[mid]) {
                return list[mid];
            } else {
                if (value > list[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ints = {6, 2, 3, 4, 56, 7, 89, 5, 54, 4, 6};

        // sort
        int x = 0;
        for (int i = x; i < ints.length; i++) {
            int temp = ints[i];
            int min = temp;
            int index = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                    index = j;
                }
            }
            ints[i] = min;
            ints[index] = temp;
            x++;
        }
        for (int index : ints
        ) {
//            System.out.print(index+" ");
        }
        System.out.println(search(ints, 5));


    }
}
