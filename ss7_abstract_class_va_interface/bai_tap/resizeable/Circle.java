package ss7_abstract_class_va_interface.bai_tap.resizeable;

public class Circle implements Resizeable{
    private double radios;
    private String color;

    public Circle() {
    }

    public Circle(double radios, String color) {
        this.radios = radios;
        this.color = color;
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*this.radios*this.radios;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radios=" + radios +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radios = this.radios*percent/100;
    }
}
