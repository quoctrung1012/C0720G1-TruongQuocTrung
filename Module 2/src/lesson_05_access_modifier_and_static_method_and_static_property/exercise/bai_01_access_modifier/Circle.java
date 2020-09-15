package lesson_05_access_modifier_and_static_method_and_static_property.exercise.bai_01_access_modifier;

public class Circle {
private double radius = 1.0;
private String color = "red";

    public Circle() {
    }
    //dùng default
//    void  Circle(){
//        this.radius = radius;
//    }
    //protected
//    protected Circle(double radius) {
//        this.radius = radius;
//    }
//
//    pubilc
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }

    //dùng default
//    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        System.out.println("Hình 1\n" + "Diện tích: " + circle1.getArea() + "\n" + "Màu: " + circle1.getColor());
//        Circle circle2 = new Circle();
//        circle2.setRadius(2.0);
//        circle2.setColor("blue");
//        System.out.println("Hình 2\n" + "Diện tích: " + circle2.getArea() + "\n" + "Màu: " + circle2.getColor());
//    }

}
