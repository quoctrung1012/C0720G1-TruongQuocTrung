package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.triangle_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public void testTriangle(double a, double b, double c) throws IllegalTriangleException{
//        if (a <= 0 || b <= 0 || c <= 0) {
//            throw new ArithmeticException("You entered zero or negative numbers. You should re-enter");
//        } else
        if (a + b - c < 0 || b + c - a < 0 || c + a - b < 0) {
            System.out.println("Not a Triangle");
        } else {
            System.out.println("Is a Triangle");
            System.exit(0);
        }
    }


    public static void main(String[] args) throws IllegalTriangleException{
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
                triangle.testTriangle(a, b, c);
            } catch (IllegalTriangleException ex) {
                System.err.println(ex.getMessage());
                System.out.println("-------------------------------------------------------------");
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.err.println("Input number not String. You should re-enter");
                System.out.println("Enter new sides");
                System.out.println("-------------------------------------------------------------");
                scanner.nextLine();
            }
        }
    }
}

