package ss17_binary_file.exercise.optional_copy_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void copyFile(String sourcePath,String destPath){
        List list = new ArrayList();
        try {
//            FileInputStream fis = new FileInputStream(sourcePath);
//            ObjectInputStream ois = new ObjectInputStream(fis);
            FileInputStream fis = new FileInputStream(sourcePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            FileOutputStream os = new FileOutputStream(destPath);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(list);
            os.close();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("file ");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        copyFile("/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/product.dat","/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/productCopy.dat");
    }
}
