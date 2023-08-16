package ss6_ke_thua.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }
    public Cylinder(double radios, String color, double height) {
        super(radios, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVol(){
        return this.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radios="+getRadios()+
                "height=" + height +
                '}';
    }


}
