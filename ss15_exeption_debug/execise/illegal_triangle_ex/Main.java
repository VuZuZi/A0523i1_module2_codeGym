package ss15_exeption_debug.execise.illegal_triangle_ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check;
        do {
            check = true;
            try {
                System.out.print("nhập cạnh thứ 1 của tam giác: ");
                double e1 = sc.nextDouble();
                System.out.print("nhập cạnh thứ 2 của tam giác: ");
                double e2 = sc.nextDouble();
                System.out.print("nhập cạnh thứ 3 của tam giác: ");
                double e3 = sc.nextDouble();
                checkTriangleEdge(e1,e2,e3);
            }catch (IllegalTriangleException e){
                System.out.println("các cạnh lỗi");
                check = false;
            }catch (Exception e){
                e.printStackTrace();
                check = false;
            }
        }while (!check);

    }

    public static boolean checkTriangleEdge(double edge1,double edge2,double edge3) throws IllegalTriangleException {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0){
            throw new IllegalTriangleException("cạnh của tam giác phải lớn hơn 0");
        } else if (edge1 + edge2 <= edge3 || edge2 + edge1 <= edge3 || edge3 + edge2 <= edge1  ) {
            throw new IllegalTriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
    return true;
    }
}
