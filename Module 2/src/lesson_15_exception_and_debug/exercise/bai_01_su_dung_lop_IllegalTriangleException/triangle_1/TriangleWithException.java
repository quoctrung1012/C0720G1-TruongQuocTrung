package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.triangle_1;

import java.util.Scanner;

public class TriangleWithException {
    public static void main(String[] args) throws lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.triangle_3.IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        // create triangle
        Triangle triangle = new Triangle();
        boolean done = false;
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;

        System.out.println("Enter three sides: ");

        while (!done) {
            try {
                System.out.print("input side1: ");
                side1 = Double.parseDouble(scanner.nextLine());
                System.out.print("input side2: ");
                side2 = Double.parseDouble(scanner.nextLine());
                System.out.print("input side3: ");
                side3 = Double.parseDouble(scanner.nextLine());
                triangle = new Triangle(side1, side2, side3);
                done = true;
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Enter three sides:  ");
                scanner.nextLine();
            }
        }
        System.out.println("Enter a color:  ");
        String color = scanner.next();
        triangle.setColor(color);

        System.out.println("Enter true or false for triangle filled: ");
        boolean filled = scanner.nextBoolean();
        triangle.setFilled(filled);
        System.out.println();
        System.out.println(triangle.toString() +
                "\narea: " + triangle.getArea() +
                "\nperimeter " + triangle.getPerimeter() +
                "\ncolor: " + triangle.getColor() +
                "\nfilled: " + triangle.isFilled());
    }
}