package lesson_14_sort_algorithm.exercise.bai_01_thuat_toan_chen;

import java.util.Scanner;

public class InsertionSort {
    //static int[] list = {2, 9, 5, 4, 8, 1, 6};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.print("List after the  " + i + "' sort: ");
//            for (int j = 0; j < list.length; j++) {
//                System.out.print(list[j] + "\t");
//            }
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + "\t");
//        }
    }
}
