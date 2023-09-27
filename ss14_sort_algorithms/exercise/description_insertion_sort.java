package ss14_sort_algorithms.exercise;

public class description_insertion_sort {
    static int[] insertionSort(int[] list){//chen
        int x,post;
        int[] subList = new int[list.length-1];
        System.out.println("tạo mảng con lưu list đã được sắp xếp");
        System.out.println("x lưu vị trí tiếp theo cần sắp xếp");
        System.out.println("post là vị trí của x");
        for (int i = 0; i < list.length-1; i++) {
            x = list[i];
            post = i;
            subList[i] = x;
            System.out.println("sắp xếp: x = "+x+" vị trí = "+post);
            System.out.println("Mảng con");
            for (int num :subList
                 ) {
                System.out.print(num);
            }
            System.out.println();
            for (int j = 0; j <= i ; j++) {
                if (subList[i] <= subList[j]){
                    System.out.println("vị trí chèn "+x+" là "+j);
                    post = j;
                    break;
                }
            }
            int temp = subList[post];
            subList[post] = subList[i];
            subList[i] = temp;
            System.out.println("mảng con sau khi chèn");
            for (int num :subList
            ) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        return subList;
    }

    public static void main(String[] args) {
        int[] list = {1,5,4,2,3,6,9,7,8};

        for (int i:insertionSort(list)
             ) {
            System.out.print(i);
        }
    }
}
