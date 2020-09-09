package lesson_01_introduction_to_java.practice;

import java.util.Scanner;

public class Bai04GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print ("a : ");
        a = scanner.nextDouble();
        System.out.print ("b : ");
        b = scanner.nextDouble();


        if (a != 0){
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }   else if (b == 0) {
            System.out.print("The solution is all x!");
        }   else {
            System.out.print("No solution!");
        }


    }
}
