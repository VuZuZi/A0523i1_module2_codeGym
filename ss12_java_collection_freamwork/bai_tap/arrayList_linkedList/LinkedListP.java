package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.Collections;
import java.util.Scanner;

public class LinkedListP implements IManager{
    Scanner sc = new Scanner(System.in);

    public class Node{
        private Product product;
        private Node next;
        public Node(Product product) {
            this.product = product;
        }
        public Product getProduct() {
            return product;
        }
    }
    private Node heap;
    private int numNode = 0;
    @Override
    public void addProduct(Product product) {
        if (heap == null){
            heap = new Node(product);
        }else {
            Node temp = heap;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(product);
        }
    }

    @Override
    public void showAllProduct() {
        Node temp = heap;
        if (temp == null){
            System.out.println("list rỗng");
        }else {
            while (temp!=null){
                System.out.println(temp.getProduct());
                temp = temp.next;
            }
        }
    }

    @Override
    public Product getById(int id) {
        boolean flag = false;
        Node temp = heap;
        if (temp == null){
            System.out.println("list rỗng");
            return null;
        }else {
            while (temp != null){
                if (temp.getProduct().getId()==id){
                    return temp.getProduct();
                }
            }
            return null;
        }
    }

    @Override
    public void editProduct(int id) {
        Node temp = heap;
       top: while (temp != null) {
            if (temp.getProduct().getId() == id) {
                System.out.println("=== Edit ===");
                String[] op = {"Edit Name", "Edit Price"};
                switch (Menu.option(op)) {
                    case 1:
                        System.out.print("Old name: " + temp.getProduct().getName() + " Name update: ");
                        temp.getProduct().setName(sc.nextLine());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.print("Old Price: " + temp.getProduct().getPrice() + " Price update: ");
                        temp.getProduct().setPrice(Double.parseDouble(sc.nextLine()));
                        System.out.println("");
                        break;
                    default:
                        break top;

                }
            }
        }
    }

    @Override
    public void delProduct() {
        Node temp = heap;
        int id;
        int index = 0;
        do {
            System.out.print("Input id product delete: ");id = Integer.parseInt(sc.nextLine());
            if (getById(id)==null){
                System.out.println("không tìm thấy product");
            }else {
                break;
            }
        }while (true);
        while (temp != null){
            if (temp.getProduct().getId() == id){
                break;
            }else {
                index++;
            }
        }
        Node temp2 = heap;
        for (int i = 0; i < index - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
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
                case 6:
                    System.out.println("err"); break;
                default:
                    System.out.println("---Exit---");
                    check = false;
            }
        }while (check);
    }
}
