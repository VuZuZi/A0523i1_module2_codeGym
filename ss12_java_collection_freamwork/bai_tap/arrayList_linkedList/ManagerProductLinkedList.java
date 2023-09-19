package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ManagerProductLinkedList {
    Scanner sc = new Scanner(System.in);
    private Node head;

    public ManagerProductLinkedList(Node product) {
        this.head = product;
    }



    public class Node {
        private Product data;
        private Node next;

        private Node (Product p){this.data = p;}

        public Product getData() {
            return data;
        }
    }
    public void add(Node p){
        Node temp = head;

        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = p;
    }
    public Product getById(int id){
        Node temp = head;
        while (temp.next!=null){
            if (temp.getData().getId() == id){
                return temp.getData();
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
    private static LinkedList<Product> list = new LinkedList<>();
    static {
        list.add(new Product(1,"a",6.1));
        list.add(new Product(2,"b",7.2));
        list.add(new Product(5,"e",6.1));
        list.add(new Product(3,"c",5.8));
        list.add(new Product(6,"f",8.1));
        list.add(new Product(4,"d",1.6));
    }
}
