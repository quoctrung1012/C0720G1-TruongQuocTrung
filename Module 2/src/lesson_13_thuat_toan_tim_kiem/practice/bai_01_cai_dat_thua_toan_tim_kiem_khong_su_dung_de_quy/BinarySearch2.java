package lesson_13_thuat_toan_tim_kiem.practice.bai_01_cai_dat_thua_toan_tim_kiem_khong_su_dung_de_quy;

import java.util.Scanner;

public class BinarySearch2 {
    static int binarySearch2(int array[], int find) {
        int first = 0, length = array.length - 1;
        while (first <= length) {
            int m = first + (length - first) / 2;
            if (array[m] == find)
                return m;
            if (array[m] < find)
                first = m + 1;
            else
                length = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch2 binarySearch2 = new BinarySearch2();
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        //int length = array.length;
        System.out.println("Input element find index:");
        int find = scanner.nextInt();
        int result = binarySearch2.binarySearch2(array, find);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at " + find + " index " + result);
        }
        System.out.println("Element found at " + 70 + ", index: " + binarySearch2(array, 70));
    }
}
