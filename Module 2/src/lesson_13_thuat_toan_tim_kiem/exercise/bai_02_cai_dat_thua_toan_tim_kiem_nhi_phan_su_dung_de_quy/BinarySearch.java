package lesson_13_thuat_toan_tim_kiem.exercise.bai_02_cai_dat_thua_toan_tim_kiem_nhi_phan_su_dung_de_quy;

public class BinarySearch {
    //    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int array[], int first, int length, int find) {
        if (length >= first) {
            int mid = first + (length - first) / 2;
            if (array[mid] == find)
                return mid;
            if (array[mid] > find)
                return binarySearch(array, first, mid - 1, find);
            return binarySearch(array, mid + 1, length, find);
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
