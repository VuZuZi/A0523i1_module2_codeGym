package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ManagerProductLinkedList {
    private class Node{
        private Product product;
        private Node next;
    }
    private Node heap;

    public ManagerProductLinkedList(Node heap) {
        this.heap = heap;
    }

    private static LinkedList<Product> list = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    static{
        list.add(new Product(1,"a",6.1));
        list.add(new Product(2,"b",7.2));
        list.add(new Product(5,"e",6.1));
        list.add(new Product(3,"c",5.8));
        list.add(new Product(6,"f",8.1));
        list.add(new Product(4,"d",1.6));
    }
}
