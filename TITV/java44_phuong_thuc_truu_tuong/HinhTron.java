package TITV.java44_phuong_thuc_truu_tuong;

public class HinhTron extends Hinh{
    private double r;


    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r*r;
    }
}
