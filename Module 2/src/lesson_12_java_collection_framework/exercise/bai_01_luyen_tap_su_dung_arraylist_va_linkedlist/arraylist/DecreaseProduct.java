package lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist.arraylist;

import java.util.Comparator;

public class DecreaseProduct implements Comparator<Product> {

    @Override
    public int compare(Product product01, Product product02) {
        if(product01.getPrice() < product02.getPrice()){
            return 1;
        }else if(product01.getPrice() == product02.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
