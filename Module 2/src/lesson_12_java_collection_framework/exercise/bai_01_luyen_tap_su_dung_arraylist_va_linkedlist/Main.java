package lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist;

import static lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist.ProductManager.arrayList;
import static lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist.ProductManager.menu;

public class Main {
    public static void main(String[] args) {
        arrayList.add(new Product(7, "Tủ Lạnh", "Đồ gia dụng", 2000));
        arrayList.add(new Product(22, "Máy giặt", "Đồ gia dụng", 1500));
        arrayList.add(new Product(15, "Lò vi sóng", "Đồ gia dụng", 3000));
        arrayList.add(new Product(9, "Ti-vi", "Đồ gia dụng", 3000));
        menu();

    }
}
