package lesson_03_array_to_java.practice;

public class Bai05TimGiaTriNhoNhatBangPhuongThuc {
//    //Bước 1: Cài đặt nguyên mẫu phương thức
//    public static int minValue(int[] array){
//        return -1;
//    }
//    //Bước 2: Tạo phương thức main() để thực thi chương trình
//    public static void main(String[] args) {
//        int []arr = {4, 12, 7, 8, 1, 6, 9};
//        int index = minValue(arr);
//        System.out.println("The smallest element in the array is: " + arr[index]);
//    }

    //Bước 1: Cài đặt nguyên mẫu phương thức
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Bước 2: Tạo phương thức main() để thực thi chương trình
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("The smallest element in the array is: " + minValue(arr));
    }
}
