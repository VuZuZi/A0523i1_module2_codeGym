package TITV.java44_phuong_thuc_truu_tuong;

public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo) { // constructor này không được dùng để tạo ra 1 đối tượng
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public abstract double tinhDienTich();
}
