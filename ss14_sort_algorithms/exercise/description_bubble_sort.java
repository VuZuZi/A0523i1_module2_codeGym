package ss14_sort_algorithms.exercise;

public class description_bubble_sort {
    static int[] bubbleSort(int[] list){//sap xep noi bot
        System.out.print("list input :");
        for (int number: list
             ) {
            System.out.print(" "+ number);
        }
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length-1; j > i; j--) {
                System.out.println("so sánh "+list[j] +" và "+ list[j-1]);
                if (list[j] < list[j-1]){
                    System.out.println(list[j] +" < "+ list[j-1]+" - đổi chỗ");
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                    System.out.print("list sau khi đổi chỗ :");
                    for (int number: list
                    ) {
                        System.out.print(" "+ number);
                    }
                    System.out.println();
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {1,2,4,5,15,12,6,7,2,34,1};
        System.out.print("list input :");
        for (int number: bubbleSort(list)
        ) {
            System.out.print(" "+ number);
        }
        System.out.println();
    }
}
