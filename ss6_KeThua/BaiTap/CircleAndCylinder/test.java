package ss6_KeThua.BaiTap.CircleAndCylinder;

public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Cylinder cy1 = new Cylinder();
        c1.setRadios(5);
        System.out.println(" diện tích của hình tròn bán kính r = "+c1.getRadios()+": "+c1.getArea());
        cy1.setRadios(5);
        cy1.setHeight(4);
        System.out.println("Thể tích hình trụ có bán kính đáy "+cy1.getRadios()+" S đáy "+cy1.getArea()+" Thể tích: "+cy1.getVol());
    }
}
