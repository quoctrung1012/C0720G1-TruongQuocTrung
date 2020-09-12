package lesson_04_oop_to_java.exercise.Bai01XayDungLopQuadraticEquation;

public class QuadraticEquation1 {
    double a, b, c;

    public QuadraticEquation1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant1() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant1())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant1())) / (2 * a);
    }

    public double getRoot3() {
        return -b / (2 * a);
    }
}
