package ss16_io_text_file.practive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/vuzuzi/Documents/GitHub/module2/ss16_io_text_file/practive/number.txt";
        TestFile test = new TestFile();
//        test.readFileText(path);
        List list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(2);
        test.writeFile(path,test.findMax(list));
    }
}
