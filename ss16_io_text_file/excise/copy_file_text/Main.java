package ss16_io_text_file.excise.copy_file_text;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int kyTu = 0;
        try {
            String pathRead = "/Users/vuzuzi/Documents/GitHub/module2/ss16_io_text_file/practive/number.txt";
            File file = new File(pathRead);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            String pathWrite = "/Users/vuzuzi/Documents/GitHub/module2/ss16_io_text_file/practive/numberAfter.txt";
            File fileWrite = new File(pathWrite);
            if (fileWrite.exists()){
                System.out.println("file đã tồn taị");
                System.err.println("file bị ghi đè");
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            FileWriter fw = new FileWriter(pathWrite);
            BufferedWriter bf = new BufferedWriter(fw);
            String line = "";
            while ((line = br.readLine()) != null){
                bf.write(line+"\n");
                kyTu += line.length();
            }
            System.out.println("số ký tự đã copy: "+kyTu);
            br.close();
            bf.close();

        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file đầu vào");
        } catch (IOException e) {
            System.out.println("file rỗng");
        }
    }
}
