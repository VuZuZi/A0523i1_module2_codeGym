package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_comparable;

import ss6_ke_thua.bai_tap.circle_and_cylinder.Circle;

public class ComparableCircle extends Circle implements Comparable<Circle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radios) {
        super(radios, "color");
    }

    @Override
    public int compareTo(Circle o) {
        if (getRadios() > o.getRadios())return -1;
        else if (getRadios() == o.getRadios())return 0;
        else return 1;
    }
}
