package TITV.Java45_abstract2.phuong_tien;

import TITV.Java45_abstract2.HangSanXuat;
import TITV.Java45_abstract2.PhuongTienDiChuyen;

public class XeOto extends PhuongTienDiChuyen {
    String loaiNhienLieu;

    public XeOto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(hangSanXuat, "Oto");
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    protected double layVanToc() {
        return 50;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
