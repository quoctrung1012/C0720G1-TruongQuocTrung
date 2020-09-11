package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai07TinhTongCacDuongCheo2Chieu {
    public static void main(String[] args) {
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận");
        row = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận");
        column = scanner.nextInt();
        int array[][] = new int[row][column];

        System.out.println("Nhập các phần tử cho ma trận.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Mảng vừa được nhập là:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum_1=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum_1 += array[i][j];
                }
            }
        }
        int sum_2=0;
        for (int i = 0; i<row ;i++){
            for (int j=column; j>=i;j++){
                sum_2 += array[i][j];
            }
        }
        int sum_3 = sum_1 + sum_2;
        System.out.println("Tổng đường chéo thứ nhất là:" + sum_1 +
                        "\n Tổng đường chéo thứ hai là: " + sum_2 +
                        "\n Tổng hai đường chéo là: " + sum_3);
    }
}
