package lesson_05_access_modifier_and_static_method_and_static_property.exercise.bai_01_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7.0);
        System.out.println("Hình 1\n" + "Diện tích: " + circle1.getArea() + "\n" + "Màu: " + circle1.getColor());
        Circle circle2 = new Circle();
        circle2.setRadius(2.0);
        circle2.setColor("blue");
        System.out.println("Hình 2\n" + "Diện tích: " + circle2.getArea() + "\n" + "Màu: " + circle2.getColor());
    }
}
