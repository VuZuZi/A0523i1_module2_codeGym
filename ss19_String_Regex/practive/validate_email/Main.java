package ss19_String_Regex.practive.validate_email;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            EmailExample emailExample = new EmailExample();
            System.out.print("nhập mail:");
            Scanner sc = new Scanner(System.in);
            String mail = sc.next();
            boolean isValid = emailExample.validate(mail);
            System.out.println(isValid);
        }while (true);

    }
}
