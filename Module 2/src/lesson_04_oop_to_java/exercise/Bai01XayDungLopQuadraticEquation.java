package lesson_04_oop_to_java.exercise;

import java.util.Scanner;

public class Bai01XayDungLopQuadraticEquation {
    public static class QuadraticEquation {
        double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return b * 2 - 4 * a * c;
        }

        public double getRoot1() {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }

        public double getRoot2() {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }

        public double getRoot3() {
            return -b / (2 * a);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Công thức tổng quát phương tròng bậc 2: Ax^2 + Bx + C = 0");
        System.out.println("Nhập A");
        double a = scanner.nextDouble();
        System.out.println("Nhập B");
        double b = scanner.nextDouble();
        System.out.println("Nhập C");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm");
            System.out.println("x = " + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trinh vô nghiệm");
        }
    }
}
