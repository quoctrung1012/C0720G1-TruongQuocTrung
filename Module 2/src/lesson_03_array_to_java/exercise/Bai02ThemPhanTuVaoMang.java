package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai02ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int array[] = new int[(size+2)];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên cần chèn: ");
        int X = scanner.nextInt();

        System.out.println("Nhập vị trí 'số nguyên' cần chèn: ");
        int index = scanner.nextInt();

        for (i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = X;

        System.out.println("Mảng sau khi chèn phần tử " + X + " là:");
        for (i = 0; i < (size+2); i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
