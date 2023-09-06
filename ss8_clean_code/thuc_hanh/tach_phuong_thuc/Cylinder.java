package ss8_clean_code.thuc_hanh.tach_phuong_thuc;

public class Cylinder {
    private static double getBaseArea(int radius){
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
    private static double getPerimeter(int radius){
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
