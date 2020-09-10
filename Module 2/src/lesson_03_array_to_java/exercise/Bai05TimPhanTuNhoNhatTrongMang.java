package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai05TimPhanTuNhoNhatTrongMang {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.print("A[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Phần tử nhỏ nhất trong mảng = " + minValue(array));
    }
}



