package ss7_abstract_class_va_interface.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3,"");
        shapes[1] = new Square(4);

        for (Shape s:shapes
             ) {
            System.out.println(s.getArea());
            if (s instanceof Colorable){
                System.out.println("tr");
                ((Colorable) s).howToColor();
            }
        }
    }
}
