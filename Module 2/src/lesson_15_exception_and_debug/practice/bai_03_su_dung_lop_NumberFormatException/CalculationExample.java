package lesson_15_exception_and_debug.practice.bai_03_su_dung_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    //Bước 1: Tạo lớp CalculationExample
    //Tạo phương thức calc với đầu vào là 2 số nguyên x và y. In ra kết quả Cộng, Trừ, Nhân, Chia.
    //Khi y = 0 hoặc x=y=0 sẽ xuất hiện thông báo lỗi ngoại lệ.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x : y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
