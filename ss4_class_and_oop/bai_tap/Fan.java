package ss4_class_and_oop.bai_tap;

import java.util.Scanner;

public class Fan {
    private static int SLOW = 1;
    private static int MEDIUM = 2;
    private static int FAST = 3;
    private int speed; //tốc độ của quạt
    private boolean on;// tắt/mở
    private double radius; //bán kính
    private String color; // màu

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.;
        color = "Blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan f1 = new Fan(FAST,true,10.,"Yellow");
        Fan f2 = new Fan(MEDIUM,false,5.,"Blue");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
