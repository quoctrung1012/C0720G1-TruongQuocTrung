package lesson_06_extends_to_java.exercise.Bai01ClassCircleAndClassCylinder.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2, "red");
        System.out.println(circle);

        circle.setRadius(5);
        circle.setColor("white");
        System.out.println(circle);
    }
}
