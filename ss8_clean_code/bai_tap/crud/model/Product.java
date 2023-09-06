package ss8_clean_code.bai_tap.crud.model;

public class Product {//id, name, giá, mô tả sản phẩm)
    private int id;
    private String name;
    private double price;
    private String about;

    public Product(int id, String name, double price, String about) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", about='" + about + '\'' +
                '}';
    }
}
