package lesson_15_exception_and_debug.practice.bai_02_su_dung_lop_ArrayIndexOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    //Bước 1: Tạo lớp ArrayExample
    //Tạo phương thức createRandom Trả về mảng số nguyễn ngẫu nhiên từ 0 đến 100.
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    //Bước 2: Tạo hàm main cho phép người dùng nhập vào chỉ số của một phần tử bất kỳ,
    // đồng thời tìm kiếm giá trị phần tử theo chỉ số đó dựa trên mảng vừa tạo
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arrayExampleRandom = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int input = 0;
        try {
            input = scanner.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số " + input + " là: " + arrayExampleRandom[input]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        } catch (InputMismatchException e) {
            System.err.println("Bạn vừa nhập một chuỗi.");
        }
    }
}
