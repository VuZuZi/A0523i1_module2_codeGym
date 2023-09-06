package ss8_clean_code.bai_tap.crud.service.implement;

import ss8_clean_code.bai_tap.crud.model.Product;
import ss8_clean_code.bai_tap.crud.reponsitory.IProductRepository;
import ss8_clean_code.bai_tap.crud.reponsitory.implement.ProductRepository;
import ss8_clean_code.bai_tap.crud.service.IProductService;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
                System.out.println((i+1)+" - "+products[i]);
            }
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
