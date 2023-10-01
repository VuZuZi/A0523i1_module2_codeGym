package ss17_binary_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
//        while (true) {
//            System.out.print("Input a char: ");
//            int ch = is.read();
//            if (ch == 'q') {
//                System.out.println("finished!");
//                break;
//            }
//            is.skip(2);// Loại bỏ 2 ký tự \r và \n
//            System.out.println("char is " + (char) ch);
//        }

        is = new FileInputStream("/Users/vuzuzi/Documents/GitHub/module2/ss17_binary_file/data/file.txt");
        int i = -1;
        while ((i = is.read()) != -1){
            System.out.print((char)i);
        }
        is.close();
    }
}
