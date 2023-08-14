package ss4_ClassAndOop.BaiTap;

import java.util.Scanner;

public class QuadreticEquation {
    private double a;
    private double b;
    private double c;

    public QuadreticEquation() {
    }

    public QuadreticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Double getDiscriminant(){
        double delta = (this.b*this.b)-(4*this.a*this.c);
        return delta;
    }
    public Double getRoot1(){
        if (getDiscriminant()<0){
            return 0.0;
        }else {
            double r1 = (-b + Math.sqrt(getDiscriminant())) / 2 * this.a;
            return r1;
        }
    }
    public Double getRoot2(){
        if (getDiscriminant()<0){
            return 0.0;
        }else {
            double r1 = (-b - Math.pow(getDiscriminant(),0.5)) / 2 * this.a;
            return r1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Phương trình Ax^2 + Bx + C = 0");
        System.out.println("---Input---");
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        System.out.print("C: ");
        double c = sc.nextDouble();

        QuadreticEquation temp = new QuadreticEquation(a,b,c);
        if (temp.getRoot1()!= 0.0) {
            System.out.print("Root1 x: " + temp.getRoot1());
            System.out.println();
            System.out.print("Root2 x: " + temp.getRoot2());
        }else {
            System.out.println("Không có nghiệm");
        }

    }
}
