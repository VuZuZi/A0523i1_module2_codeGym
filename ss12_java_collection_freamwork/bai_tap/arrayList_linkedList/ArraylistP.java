package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistP implements IManager{
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> list = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        list.add(product);
    }

    @Override
    public void showAllProduct() {
        System.out.println("=== All Product ===");
        for (Product product:list
        ) {
            System.out.println(product.toString());
        }
        System.out.println("---------");
    }

    @Override
    public Product getById(int id) {
        boolean check = false;
        for (Product p: list
        ) {
            if (p.getId() == id){
                check = true;
                return p;
            }
        }
        return null;
    }

    @Override
    public void editProduct(int id) {
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


    @Override
    public void delProduct() {
        int id;
        do {
            System.out.print("Input id product remove: ");
            id = Integer.parseInt(sc.nextLine());
            if (getById(id)!= null){
                list.remove(getById(id));
                System.out.println("Remove successfully");
                break;
            }
        }while (true);
    }

    @Override
    public Product searchProduct() {
        System.out.println("---Searching---");
        System.out.print("Nhập id product cần tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        if (getById(id)==null){
            return null;
        }else {
            return getById(id);
        }
    }

    @Override
    public void sortByPriceProduct() {
        Collections.sort(list);
        showAllProduct();
    }

    @Override
    public void showMain() {

        boolean check = true;
        String[] op = {"Show list product",
                "Add a product",
                "Edit product by id",
                "Remove a product",
                "Search product by id",
                "Sort product by price"};
        do{
            switch (Menu.option(op)){
                case 1: showAllProduct();
                    break;
                case 2:
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
                    addProduct(newP);
                    break;
                case 3:
                    System.out.print("Input id product edit: ");
                    int idProductE = Integer.parseInt(sc.nextLine());
                    editProduct(idProductE);
                    break;
                case 4:delProduct();break;
                case 5:
                    System.out.print("Input id search: ");
                    int idP = Integer.parseInt(sc.nextLine());
                    getById(idP);break;
                case 6:sortByPriceProduct();showAllProduct(); break;
                default:
                    System.out.println("---Exit---");
                    check = false;
            }
        }while (check);
    }
}
