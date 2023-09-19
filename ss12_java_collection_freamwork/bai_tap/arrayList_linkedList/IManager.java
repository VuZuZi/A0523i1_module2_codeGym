package ss12_java_collection_freamwork.bai_tap.arrayList_linkedList;

public interface IManager {
    void addProduct(Product product);
    void showAllProduct();
    Product getById(int id);
    void editProduct(int id);
    void delProduct();
    Product searchProduct();
    void sortByPriceProduct();
    void showMain();
}
