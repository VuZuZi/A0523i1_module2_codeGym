package ss19_String_Regex.practive.validateAccount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Không chứa các ký tự đặc biệt
        //Ít nhất là 6 ký tự
        //Không chứa các ký tự viết hoa
        //Cho phép dấu gạch dưới (_)
        String validateAc = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(validateAc);
        do {
            System.out.print("input account: ");
            String acc = sc.next();
            Matcher matcher = pattern.matcher(acc);
            System.out.println(matcher.matches());
        }while (true);


    }
}
