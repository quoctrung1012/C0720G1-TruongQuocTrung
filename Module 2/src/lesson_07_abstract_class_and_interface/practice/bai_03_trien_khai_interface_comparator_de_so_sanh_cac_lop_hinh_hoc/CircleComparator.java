package lesson_07_abstract_class_and_interface.practice.bai_03_trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
