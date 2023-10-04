package ss17_binary_file.exercise.manager_product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static void writeFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<Product> readFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
//
//        Product p1 = new Product (1,"ip3","apple",1.2,"first");
//        Product p2 = new Product (2,"ip4","apple",2.2,"second");
//        Product p3 = new Product (3,"ip5","apple",3.2,"third");
//        Product p4 = new Product (4,"ip6","apple",4.2,"fourth");
//
//        products.add(p1);
//        products.add(p2);
//        products.add(p3);
//        products.add(p4);
//
//        writeFile("/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/products.txt",products);

        products = readFile("/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/products.txt");
        for (Product p: products
             ) {
            System.out.println(p.toString());
        }
    }
}
