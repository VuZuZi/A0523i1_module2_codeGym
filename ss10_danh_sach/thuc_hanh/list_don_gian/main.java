package ss10_danh_sach.thuc_hanh.list_don_gian;

public class main {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);

        System.out.println("e4: "+listInt.get(4));
        System.out.println("e2: "+listInt.get(2));
        System.out.println("e6: "+listInt.get(5));
//        System.out.println("e6: "+listInt.get(8));
        System.out.println("e-1: "+listInt.get(-1));

    }
}
