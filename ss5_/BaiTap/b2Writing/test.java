package ss5_.BaiTap.b2Writing;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Students s = new Students();
        System.out.println(s.toString());
        Scanner sc = new Scanner(System.in);
        System.out.print("Set name: ");
        s.setName(sc.nextLine());
        System.out.print("Set class: ");
        s.setClasses(sc.nextLine());
        System.out.println(s.toString());
    }
}
