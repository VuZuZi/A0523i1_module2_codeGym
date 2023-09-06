package TITV.Java45_abstract2.phuong_tien;

import TITV.Java45_abstract2.HangSanXuat;
import TITV.Java45_abstract2.PhuongTienDiChuyen;

public class MayBay extends PhuongTienDiChuyen {
    String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(hangSanXuat, "Máy bay");
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    protected double layVanToc() {
        return 500;
    }
    public void catCanh(){
        System.out.println("Máy bay cất cánh");
    }

    public void haCanh(){
        System.out.println("Máy bay hạ cánh");
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
