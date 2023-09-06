package TITV.Java45_abstract2.phuong_tien;

import TITV.Java45_abstract2.HangSanXuat;
import TITV.Java45_abstract2.PhuongTienDiChuyen;

public class XeDap extends PhuongTienDiChuyen {
    public XeDap(HangSanXuat hangSanXuat) {
        super(hangSanXuat, "xe dap");
    }

    @Override
    protected double layVanToc() {
        return 5;
    }
}
