package ss6_ke_thua.bai_tap.point_and_movablepoint;

public class test {

    public static void main(String[] args) {
        Point p = new Point(5,6);
        MovAblePoint mp = new MovAblePoint(1,2,3,4);
        System.out.println(p.toString());
        System.out.println(mp.toString());
        mp.movAblePoint();
        System.out.println(mp.toString());
    }
}
