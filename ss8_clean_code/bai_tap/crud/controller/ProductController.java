package ss8_clean_code.bai_tap.crud.controller;

import ss8_clean_code.bai_tap.crud.reponsitory.IProductRepository;
import ss8_clean_code.bai_tap.crud.service.IProductService;
import ss8_clean_code.bai_tap.crud.service.implement.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenuP(){
        IProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1 - display list product");
            System.out.println("2 - add product");
            System.out.println("3 - update prodcut");
            System.out.println("4 - Delete product");
            System.out.println("5 - Exit");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("---Display---");
                    productService.display();
                    break;
                case 2:
                    System.out.println("---Add product---");
                    productService.add();
                    break;
                case 3:
                    System.out.println("---Update product---");
                    productService.update();
                    break;
                case 4:
                    System.out.println("---Delete product---");
                    productService.delete();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
