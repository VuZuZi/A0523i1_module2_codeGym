package ss16_io_text_file.practive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    public void readFileText(String filePath) {
        try {
            // đọc file
            File file = new File(filePath);

            // kiểm tra file tồn tại hay không
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng: " + sum);
        } catch (Exception e) {
            System.err.println("file không tồn tại or nội dung lỗi");
        }
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("nội dung lỗi");
        }catch (Exception e){
            e.printStackTrace();
        }
        return numbers;
    }

    public void writeFile(String pathFile, int max){
        try {
            FileWriter write = new FileWriter(pathFile, true);
            BufferedWriter bw = new BufferedWriter(write);
            bw.write("giá trị lớn nhất là: "+max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findMax(List<Integer> nummbers){
        int max = nummbers.get(0);
        for (int i = 0; i < nummbers.size(); i++) {
            if (max < nummbers.get(i)){
                max = nummbers.get(i);
            }
        }
        return max;
    }

}
