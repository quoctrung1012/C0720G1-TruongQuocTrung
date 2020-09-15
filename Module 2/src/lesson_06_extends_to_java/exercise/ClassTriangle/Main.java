package lesson_06_extends_to_java.exercise.ClassTriangle;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập màu của tam giác");
        String color = scanner.nextLine();
        System.out.println("Nhập số đo cạnh thứ nhất");
        double a = scanner.nextDouble();
        System.out.println("Nhập số đo cạnh thứ hai");
        double b = scanner.nextDouble();
        System.out.println("Nhập số đo cạnh thứ ba");
        double c = scanner.nextDouble();
        Triangle triangle = new Triangle(color, a, b, c);

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Đây là tam giác cân !\n" + triangle);
            } else if ((a == b) && (b == c) && (c == a)) {
                System.out.println("Đây là tam giác đều !\n" + triangle);
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Đây là tam giác vuông !\n" + triangle);
            } else {
                System.out.println("Đây là tam giác thường !\n" + triangle);
            }
        } else {
            System.out.println("Ba cạnh vừa nhập không thể tạo thành một tam giác");
        }
    }
}

