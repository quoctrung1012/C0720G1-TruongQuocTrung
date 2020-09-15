package lesson_06_extends_to_java.exercise.Bai01ClassCircleAndClassCylinder.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(int i) {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(String aWhile) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " Circle {" +
                "Radius = " + radius +
                ", Color = '" + color + '\'' +
                ", Area = " + getArea() +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Circle is radius: " + getRadius() + "\nCircle is color: " + getColor() + "\nCircle is Area: " + getArea();
//    }
}
