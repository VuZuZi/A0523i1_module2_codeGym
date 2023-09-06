package ss7_abstract_class_va_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    double getArea() {
        return a*a;
    }
}
