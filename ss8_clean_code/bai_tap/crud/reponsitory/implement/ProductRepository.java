package ss8_clean_code.bai_tap.crud.reponsitory.implement;

import ss8_clean_code.bai_tap.crud.model.Product;
import ss8_clean_code.bai_tap.crud.reponsitory.IProductRepository;

import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner sc = new Scanner(System.in);
    private static Product[] products = new Product[20];
    static{
        products[0] = new Product(1,"ip3",500,"ip đời đầu");
        products[1] = new Product(2,"ip6",800,"ip vừa");
        products[2] = new Product(3,"ip15",1200,"ip đời mới");
    }
    @Override
    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product p) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                products[i] = p;
                break;
            }
        }
    }

    @Override
    public void updateProduct(int id) {
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId()==id){
                check = true;
                System.out.println("choose update\n" +
                        "1. update name\n" +
                        "2. update price\n" +
                        "3. update about\n"+
                        "your option: ");
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        System.out.print("old name: "+products[i].getName()+" new name: ");
                        products[i].setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("old price: "+products[i].getPrice()+" new price: ");
                        products[i].setPrice(Double.parseDouble(sc.nextLine()));
                        break;
                    case 3:
                        System.out.print("old about: "+products[i].getAbout()+" new about: ");
                        products[i].setAbout(sc.nextLine());
                        break;
                }
            }
        }
        if(!check){
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void deleteProduct(int id) {
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id){
                check =  true;
                products[i] = null;
                break;
            }
        }
        if (!check){
            System.out.println("không tìm thấy id");
        }
    }
}
