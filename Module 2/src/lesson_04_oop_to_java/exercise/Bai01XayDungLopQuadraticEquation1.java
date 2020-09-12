package lesson_04_oop_to_java.exercise;

import java.util.Scanner;

public class Bai01XayDungLopQuadraticEquation1 {
    public static class QuadraticEquation2 {
        double a, b, c;

        public QuadraticEquation2(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant2() {
            return b * 2 - 4 * a * c;
        }

        public double getRoot01() {
            return (-b + Math.sqrt(getDiscriminant2())) / (2 * a);
        }

        public double getRoot02() {
            return (-b - Math.sqrt(getDiscriminant2())) / (2 * a);
        }

        public double getRoot03() {
            return -b / (2 * a);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Công thức tổng quát phương tròng bậc 2: Ax^2 + Bx + C = 0");
        System.out.print("Nhập A");
        double a = scanner.nextDouble();
        System.out.print("Nhập B");
        double b = scanner.nextDouble();
        System.out.print("Nhập C");
        double c = scanner.nextDouble();

        QuadraticEquation2 quadraticEquation2 = new QuadraticEquation2(a, b, c);
        if (quadraticEquation2.getDiscriminant2() > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 = " + quadraticEquation2.getRoot01());
            System.out.println("x2 = " + quadraticEquation2.getRoot02());
        } else if (quadraticEquation2.getDiscriminant2() == 0) {
            System.out.println("Phương trình có 1 nghiệm");
            System.out.println("x = " + quadraticEquation2.getRoot03());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
