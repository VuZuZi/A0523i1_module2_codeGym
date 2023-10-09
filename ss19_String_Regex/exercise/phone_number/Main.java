package ss19_String_Regex.exercise.phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//
//    x là ký tự số
//
//    Không chứa các ký tự đặc biệt
//
//    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
//
//    Ví dụ tên lớp không hợp lệ: (a8)-(22222222)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String validate = "^[(][0-9]{2}[)][(][0][0-9]{9,10}[)]$";
        Pattern pattern = Pattern.compile(validate);

        do {
            System.out.print("Phone Number: ");
            String number = sc.next();
            Matcher matcher = pattern.matcher(number);
            System.out.println(matcher.matches());
        }while (true);
    }
}
