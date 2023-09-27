package ss14_sort_algorithms.practive;

public class Main {
    static int[] bubbleSort(int[] list){//sap xep noi bot
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length-1; j > i; j--) {
                if (list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        return list;
    }
    static int[] selectionSort(int[] list){ //sap xep chon
        for (int i = 0; i < list.length; i++) {
            int x = list[i];
            int index = -1;
            for (int j = i; j < list.length; j++) {
                if (x > list[j]){
                    x = list[j];
                    index = j;
                }
            }
            if (index != -1) {
                int temp = list[i];
                list[i] = list[index];
                list[index] = temp;
            }
        }
        return list;
    }
    static int[] insertionSort(int[] list){//chen
        int x,post;
        int[] subList = new int[list.length-1];
        for (int i = 0; i < list.length-1; i++) {
            x = list[i];
            post = i;
            subList[i] = x;
            for (int j = 0; j <= i ; j++) {
               if (subList[i] <= subList[j]){
                   post = j;
                   break;
               }
            }
            int temp = subList[post];
            subList[post] = subList[i];
            subList[i] = temp;
        }
        return subList;
    }

    public static void main(String[] args) {
        int[] list = {1,5,4,2,3,6,9,7,8};
        list = insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
