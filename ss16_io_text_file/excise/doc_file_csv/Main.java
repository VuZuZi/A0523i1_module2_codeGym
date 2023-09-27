package ss16_io_text_file.excise.doc_file_csv;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> listC = new ArrayList<>();
        try {
            File file = new File("/Users/vuzuzi/Documents/GitHub/module2/ss16_io_text_file/countries.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                String[] lineCsv = line.split(",");
                Country country = new Country();
                country.setId(Integer.parseInt(lineCsv[0]));
                country.setCode(lineCsv[1]);
                country.setNameC(lineCsv[2]);
                listC.add(country);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("file rỗng");
        }catch (Exception e){
            e.printStackTrace();
        }
        for (Country c : listC
        ){
            System.out.println(c.toString());
        }

    }
}
