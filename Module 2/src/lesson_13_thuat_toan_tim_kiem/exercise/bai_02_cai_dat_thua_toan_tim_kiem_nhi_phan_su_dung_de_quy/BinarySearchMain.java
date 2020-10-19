package lesson_13_thuat_toan_tim_kiem.exercise.bai_02_cai_dat_thua_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Scanner;

public class BinarySearchMain {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BinarySearch object = new BinarySearch();
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int length = array.length;
        System.out.print("Input find: ");
        int find = scanner.nextInt();
        int result = object.binarySearch(array, 0, length, find);
        if (result == -1){
            System.out.println("Element not present");
        }   else {
            System.out.println("Element " + find + " found at index " + result);
        }
    }
}
