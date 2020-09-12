package lesson_04_oop_to_java.exercise.Bai01XayDungLopQuadraticEquation;

import java.util.Scanner;

public class DisplayResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Công thức tổng quát phương tròng bậc 2: Ax^2 + Bx + C = 0");
        System.out.print("Nhập A: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập B: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập C: ");
        double c = scanner.nextDouble();
        System.out.println("Phương trình vừa nhập là: " + a + "*x^2 +" + b + "x + " + c + "= 0");

        QuadraticEquation1 quadraticEquation1 = new QuadraticEquation1(a, b, c);
        if (quadraticEquation1.getDiscriminant1() > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 = " + quadraticEquation1.getRoot1());
            System.out.println("x2 = " + quadraticEquation1.getRoot2());
        } else if (quadraticEquation1.getDiscriminant1() == 0) {
            System.out.println("Phương trình có 1 nghiệm");
            System.out.println("x = " + quadraticEquation1.getRoot3());
        } else {
            System.out.println("Phương Trình vô nghiệm");
        }
    }
}
