package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    static{
        productArrayList.add(new Product(1,"a",6.1));
        productArrayList.add(new Product(2,"b",7.2));
        productArrayList.add(new Product(5,"e",6.1));
        productArrayList.add(new Product(3,"c",5.8));
        productArrayList.add(new Product(6,"f",8.1));
        productArrayList.add(new Product(4,"d",1.6));
    }
    public void addProduct(Product p){
        productArrayList.add(p);
    }

    public Product getById(int id){
        boolean check = false;
        for (Product p: productArrayList
             ) {
            if (p.getId() == id){
                check = true;
                return p;
            }
        }
        return null;

    }

    public void editProduct(int id){
        Product p = getById(id);
        if (p == null){
            System.out.println("Không tìm thấy Product id: "+id);
            return;
        }
        String[] op = {"Edit Name","Edit Price"};
        switch (Menu.option(op)){
            case 1:
                System.out.print("Old name: "+p.getName()+" Name update: ");
                p.setName(sc.nextLine());
                System.out.println("");
                break;
            case 2:
                System.out.print("Old Price: "+p.getPrice()+" Price update: ");
                p.setPrice(Double.parseDouble(sc.nextLine()));
                System.out.println("");
                break;
            default:
                break;
        }
    }


}
