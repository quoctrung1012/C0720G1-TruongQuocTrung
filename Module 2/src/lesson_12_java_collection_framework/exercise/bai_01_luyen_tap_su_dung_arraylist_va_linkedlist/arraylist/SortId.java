package lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist.arraylist;

import java.util.Comparator;

public class SortId implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getId() > product2.getId()) {
            return 1;
        } else if (product1.getId() == product2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
