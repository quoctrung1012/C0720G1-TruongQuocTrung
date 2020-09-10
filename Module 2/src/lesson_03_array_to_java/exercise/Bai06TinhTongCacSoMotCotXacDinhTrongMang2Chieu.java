package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai06TinhTongCacSoMotCotXacDinhTrongMang2Chieu {
    public static void main(String[] args) {
//        int row, column;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số dòng của ma trận");
//        row = scanner.nextInt();
//        System.out.println("Nhập số cột của ma trận");
//        column = scanner.nextInt();
//        int array[][] = new int[row][column];
//
//        System.out.println("Nhập các phần tử cho ma trận.");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print("array[" + i + "][" + j + "] = ");
//                array[i][j] = scanner.nextInt();
//            }
//        }
//        int sum =0;
//
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {200, 983, 787, 714, 1375, 967, 1087},
                {983, 500, 214, 1102, 1763, 1723, 1842},
                {787, 214, 201, 888, 1549, 1548, 1627},
                {714, 1102, 888, 9999, 661, 781, 810},
                {1375, 1763, 1549, 661, 55, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 88, 239},
                {1087, 1842, 1627, 810, 1187, 239, 999},
        };
        System.out.println("nhập cột muốn tính tổng. ");
        int k = scanner.nextInt();
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }
    }
}
