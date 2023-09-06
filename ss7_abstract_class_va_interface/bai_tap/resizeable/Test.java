package ss7_abstract_class_va_interface.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"blue");
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(c1.getRadios());
        c1.resize(30);
        System.out.println(c1.getRadios());
        System.out.println(t1.getPerimeter());
        t1.resize(50);
        System.out.println(t1.getPerimeter());
    }
}
