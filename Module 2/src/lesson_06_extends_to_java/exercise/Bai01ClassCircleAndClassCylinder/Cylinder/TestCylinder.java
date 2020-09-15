package lesson_06_extends_to_java.exercise.Bai01ClassCircleAndClassCylinder.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setLength(5);
        System.out.println(cylinder);
    }
}
