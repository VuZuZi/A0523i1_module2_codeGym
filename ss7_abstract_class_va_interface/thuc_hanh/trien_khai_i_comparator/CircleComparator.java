package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_i_comparator;

import ss6_ke_thua.bai_tap.circle_and_cylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadios()>o2.getRadios())return 1;
        else if (o1.getRadios()==o2.getRadios()) {
            return 0;
        }else {
            return -1;
        }
    }
}
