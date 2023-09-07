package ss8_clean_code.bai_tap.crud.service.implement;

import ss8_clean_code.bai_tap.crud.model.Product;
import ss8_clean_code.bai_tap.crud.reponsitory.IProductRepository;
import ss8_clean_code.bai_tap.crud.reponsitory.implement.ProductRepository;
import ss8_clean_code.bai_tap.crud.service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((i + 1) + " - " + products[i]);
            }
        }
    }

    @Override
    public void add() {//id, name, giá, mô tả sản phẩm
        System.out.print("input id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("input name: ");
        String name = sc.nextLine();
        System.out.print("input price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("input about: ");
        String about = sc.nextLine();
        Product product = new Product(id, name, price, about);
        productRepository.addProduct(product);
    }

    @Override
    public void delete() {
        System.out.print("input id delete product: ");
        int id = Integer.parseInt(sc.nextLine());
        productRepository.deleteProduct(id);
    }

    @Override
    public void update() {
        System.out.print("input id update product: ");
        int delId = Integer.parseInt(sc.nextLine());
        productRepository.updateProduct(delId);
    }
}
