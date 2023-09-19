package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerProductLinkedList {
    private Node head;

    public ManagerProductLinkedList() {
    }

    private class Node{
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


    public ManagerProductLinkedList(Node heap) {
        this.heap = heap;
    }

    private static LinkedList<Product> list = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    static{


    }
    public void addP(Product product){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(product);
        numNode++;
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
        list.add(newP);
    }

    public Product getById(int id){
        Node temp = head;
        boolean check = false;
        while (temp.next!=null){
            if (temp.getProduct().getId()==id){
                return temp.getProduct();
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
    public void delProduct(){
        int id;
        Node temp = head;
        do {
            System.out.print("Input id product remove: ");
            id = Integer.parseInt(sc.nextLine());
            if (getById(id)!=null){
                while (temp.next != null) {
                    if (getById(id) == temp.next.getProduct()) {
                        temp.next = temp.next.next;
                        break;
                    }
                }
            }
        }while (true);
    }
    public void showAllP(){
        Node temp = head;
        System.out.println("===All Product ===");
        while (temp != null){
            System.out.println(temp.getProduct().toString());
            temp = temp.next;
        }
        System.out.println("-------------");
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
        Collections.sort(list, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice()-o2.getPrice());
            }
        });
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
