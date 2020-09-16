package lesson_06_extends_to_java.exercise.ClassTriangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getHalfPerimeter() {
        return getPerimeter() / 2;
    }
//theo công thức Heron
//p : nữa chu vi
//Căn bậc hai của (p*(p-a)*(p-b)*(p-c))
    public double getArea() {
        double p = getHalfPerimeter();
        return Math.sqrt(p* (p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "Tam giác có" +
                ", Cạnh thứ nhất = " + side1 +
                ", Cạnh thứ hai = " + side2 +
                ", Cạnh thứ ba = " + side3 +
                "\nChu vi là = " + getPerimeter() +
                "\nDiện tích là = " + getArea() + "\n" +
                super.toString();
    }
}
