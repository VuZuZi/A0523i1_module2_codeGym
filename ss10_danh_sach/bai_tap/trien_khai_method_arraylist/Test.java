package ss10_danh_sach.bai_tap.trien_khai_method_arraylist;

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.getAll();
//        list.add(9,4);
//        list.remove(2);
//        System.out.println(list.get(1));
//        list.getAll();
//        System.out.println(list.contains(0));
        System.out.println(list.indexOf(4));
    }
}
