package lesson_01_introduction_to_java.exercise;

import java.util.Scanner;

public class Bai03UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số USD cần đổi: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println("Kết quả: " + result);

    }
}
