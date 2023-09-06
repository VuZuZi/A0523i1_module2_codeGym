package TITV.java44_phuong_thuc_truu_tuong;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,6);
        ToaDo td2 = new ToaDo(16,8);
        ToaDo td3 = new ToaDo(7,9);

        Hinh hinh = new Diem(td1);
        Hinh h2 = new HinhTron(td2,3);
        Hinh h3 = new HinhChuNhat(td3,6,7);

        System.out.println(hinh.tinhDienTich());
        System.out.println(h2.tinhDienTich());
        System.out.println(h3.tinhDienTich());
    }
}
