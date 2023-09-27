package ss14_sort_algorithms.exercise;

public class description_selection_sort {
    static int[] selectionSort(int[] list){ //sap xep chon
        for (int i = 0; i < list.length; i++) {
            System.out.println("tìm con số nhỏ nhất trong mảng còn lại gán cho x = "+list[i]);
            int x = list[i];
            int index = -1;
            for (int j = i; j < list.length; j++) {
                System.out.println("kiểm tra x có phải là số nhỏ nhất trong mảng còn lại không");
                if (x > list[j]){
                    System.out.println("x = "+x+" > "+list[j]+" gán lại x = "+list[j]);
                    System.out.println("vị trí của số nhỏ nhất trong mảng còn lại: "+j);
                    x = list[j];
                    index = j;
                    System.out.println("vị trí của số tiếp theo = "+j);
                }
            }
            if (index != -1) {
                System.out.println("đổi vị trí của số nhỏ tiếp theo với số tiếp theo trong mảng");
                int temp = list[i];
                list[i] = list[index];
                list[index] = temp;
                System.out.println("mảng sau khi đổi");
                for (int k = 0; k < list.length; k++) {
                    System.out.print(list[k] + " ");
                }
                System.out.println();
            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[] list = {1,5,4,2,3,6,9,7,8};
        list = selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
