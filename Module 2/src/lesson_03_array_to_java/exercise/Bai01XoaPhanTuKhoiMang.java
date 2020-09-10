package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai01XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        //nhập kích thước mảng
        int size, i, count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int array[] = new int[size];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên cần xóa: ");
        int index = scanner.nextInt();

        // xóa phần tử index ra khỏi mảng
        // vòng lặp for sẽ khởi tạo count = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên index
        // thì gán phần tử tại i cho phần tử tại index
        // sau đó tăng count lên 1
        for (i = 0; i < size; i++) {
            if (array[i] != index) {
                array[count] = array[i];
                count++;
            }
        }
        size = count;  // lúc này số phần tử trong mảng sẽ bằng count

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + index + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
