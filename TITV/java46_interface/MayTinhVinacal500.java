package TITV.java46_interface;

public class MayTinhVinacal500 implements IMayTinhBoTui{
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}