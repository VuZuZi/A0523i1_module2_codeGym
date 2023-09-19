package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerProductArrayList {
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

    public static void showAllP(){
        for (Product product:productArrayList
             ) {
            System.out.println(product.toString());
        }
        System.out.println("---------");
    }
    public void addProduct(){
        System.out.println("-Add new product-");
        int id;
        do {
            System.out.print("Input ID: ");
            id = Integer.parseInt(sc.nextLine());
            if (getById(id) == null){
                break;
            }else {
                System.out.println("id đã tồn tại trong danh sách");
            }
        }while (true);
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        System.out.print("Input Price: ");
        double price = Double.parseDouble(sc.nextLine());
        Product newP = new Product(id,name,price);
        productArrayList.add(newP);
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

    public void editProduct(){
        System.out.print("Input id product edit: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("-- EDIT --");
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

    public void delProduct (){
        int id;
        do {
            System.out.print("Input id product remove: ");
            id = Integer.parseInt(sc.nextLine());
            if (getById(id)!= null){
                productArrayList.remove(getById(id));
                System.out.println("Remove successfully");
                break;
            }
        }while (true);
    }

    public void searchP(){
        System.out.println("---Searching---");
        System.out.print("Nhập id product cần tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        if (getById(id)==null){
            System.out.println("Không tìm thấy id "+id);
        }else {
            System.out.println("----");
            System.out.println(getById(id).toString());
            System.out.println("----");
        }
    }
    public void sortByPrice(){
        Collections.sort(productArrayList);
        showAllP();
    }
    public void showMain(){
        boolean check = true;
        String[] op = {"Show list product",
                        "Add a product",
                        "Edit product by id",
                        "Remove a product",
                        "Search product by id",
                        "Sort product by price"};
        do{
            switch (Menu.option(op)){
                case 1: showAllP();
                break;
                case 2:addProduct();
                break;
                case 3:
                    editProduct();
                    break;
                case 4:delProduct();break;
                case 5:searchP();break;
                case 6:sortByPrice(); showAllP(); break;
                default:
                    System.out.println("---Exit---");
                    check = false;
            }
        }while (check);
    }


}
