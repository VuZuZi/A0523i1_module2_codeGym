package ss4_ClassAndOop.ThucHanh;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getArea(){
        System.out.println("Diện tích "+(height*width));
    }
    public void getPerimeter(){
        System.out.println("Chu vi: "+(2*width + 2*height));
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,2);
        System.out.println(rectangle.display());
        rectangle.getArea();
        rectangle.getPerimeter();

    }
}
