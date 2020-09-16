package lesson_07_abstract_class_and_interface.exercise.bai_02_interface_colorable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape implements Colorable  {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        setShape(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }


    @Override
    public void howToColor() {
        System.out.println("Hình tròn: tô hết vòng tròn");
    }
}
