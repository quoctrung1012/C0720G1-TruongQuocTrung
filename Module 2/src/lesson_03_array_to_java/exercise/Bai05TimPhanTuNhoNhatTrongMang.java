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
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

//        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + minValue(array));

    }
}
