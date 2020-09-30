package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
        public void testTriangle(double a, double b, double c) {
        if (a + b - c <= 0 || b + c - a <= 0 || c + a - b <= 0) {
            System.out.println("Not a Triangle");
        } else {
            System.out.println("Is a Triangle");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter three sides: ");
            try {
                System.out.print("input a: ");
                double a = scanner.nextDouble();
                System.out.print("input b: ");
                double b = scanner.nextDouble();
                System.out.print("input c: ");
                double c = scanner.nextDouble();
                Triangle triangle = new Triangle();
                triangle.testTriangle(a,b,c);
            } catch (InputMismatchException ex) {
                System.out.println("Input number not String");
                System.out.println("Enter new sides");
                scanner.nextLine();
            }
        }
    }
}

