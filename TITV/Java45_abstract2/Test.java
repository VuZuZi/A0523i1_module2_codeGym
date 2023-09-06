package TITV.Java45_abstract2;

import TITV.Java45_abstract2.phuong_tien.MayBay;
import TITV.Java45_abstract2.phuong_tien.XeDap;
import TITV.Java45_abstract2.phuong_tien.XeOto;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Bojeng","My");
        HangSanXuat h2 = new HangSanXuat("Vinfast","VietNam");
        HangSanXuat h3 = new HangSanXuat("BMW","Anh");

        PhuongTienDiChuyen p1 = new MayBay(h1,"xang 98");
        PhuongTienDiChuyen p2 = new XeOto(h2,"Dien");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println(p1.layTenHangSx());
        System.out.println(p2.layTenHangSx());

        System.out.println(p2.layVanToc());
        System.out.println(p3.layVanToc());
    }
}
