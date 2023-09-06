package ss8_clean_code.bai_tap.crud.reponsitory;

import ss8_clean_code.bai_tap.crud.model.Product;

public interface IProductRepository {
    Product[] getListProduct();

    void addProduct(Product p);
    void updateProduct(int id);
    void deleteProduct(int id);

}
