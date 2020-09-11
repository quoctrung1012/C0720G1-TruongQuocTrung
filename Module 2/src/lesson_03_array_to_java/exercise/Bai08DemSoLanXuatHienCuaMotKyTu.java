package lesson_03_array_to_java.exercise;

import java.util.Scanner;

public class Bai08DemSoLanXuatHienCuaMotKyTu {
    public static void main(String[] args) {
        String str;
        char symbol = 'a';
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        str = scanner.nextLine();

        System.out.println("Nhập ký tự cần kiểm tra.");
//        symbol = str.charAt(0);
        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == symbol){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + symbol + " chuỗi " + str + " là:" + count);
    }
}
