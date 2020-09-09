package lesson_01_introduction_to_java.practice;

import java.util.Scanner;

public class Bai06TinhSoNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
//      Bước 03: Phân loại và hiển thị kết quả
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.printf("%d is a leap year", year);
//                }   else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            }   else {
//                System.out.printf("%d is a leap year", year);
//            }
//        }   else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//        Bước 04: Chạy và quan sát kết quả.
//          Nhập vào các năm sau để kiểm tra:
//          12: năm nhuận
//          13: năm không nhuận
//          1000: năm không nhuận
//          2000: năm nhuận
//          Lưu ý: Với các điều kiện như trên, chúng ta có thể chỉnh sửa để mã nguồn tốt hơn như sau:

//        boolean isLeapYear = false;
//
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//        Bước 05:Đảm bảo clean code
//
//Trong đoạn mã trên, các điều kiện bên trong các câu lệnh if sẽ là khó hiểu,
// bởi vì bản thân các biểu thức không trực tiếp nói rõ ý nghĩa của nó. Chúng ta có thể sử dụng kỹ thuật tách biến để các câu lệnh này dễ hiểu hơn.
// Ví dụ:
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
