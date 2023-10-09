package ss19_String_Regex.exercise.class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//
//        Không chứa các ký tự đặc biệt
//
//        Theo sau ký tự bắt đầu là 4 ký tự số
//
//        Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

        Scanner sc = new Scanner(System.in);
        String validate = "^[c,C,a,A,p,P][0-9]{4}[G, H, I, K, L, M]$";
        Pattern pattern = Pattern.compile(validate);
        do {
            System.out.print("input class name: ");
            String className = sc.next();
            Matcher matcher = pattern.matcher(className);
            System.out.println(matcher.matches());
        }while (true);
    }
}
