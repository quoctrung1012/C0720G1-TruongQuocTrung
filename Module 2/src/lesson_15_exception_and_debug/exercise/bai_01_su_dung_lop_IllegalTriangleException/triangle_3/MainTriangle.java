package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.triangle_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        inputShapeTriangle();
    }
    private static void inputShapeTriangle(){
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
            } catch (ArithmeticException ex) {
                System.err.println("Please do not enter numbers less than or equal to zero!! ");
            } catch (InputMismatchException ex){
                System.err.println("You input number not String. You should re-enter the whole number or the decimal number");
            }
        }
    }
}