package lesson_06_extends_to_java.exercise.Bai02ClassPoint2DAndClassPoint3D;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Point2D point2D = new Point2D();
//        System.out.println("Point 2D: " + point2D);
//
//        Point3D point3D = new Point3D();
//        System.out.println("Point 3D: " + point3D.toString());

        System.out.println("input x");
        float x =scanner.nextFloat();
        System.out.println("input y");
        float y =scanner.nextFloat();
        System.out.println("input z");
        float z =scanner.nextFloat();
        Point2D point2D = new Point2D(x,y);
        Point2D point3D = new Point3D(x,y,z);
        System.out.println(point2D);
        System.out.println(point3D);

    }
}
