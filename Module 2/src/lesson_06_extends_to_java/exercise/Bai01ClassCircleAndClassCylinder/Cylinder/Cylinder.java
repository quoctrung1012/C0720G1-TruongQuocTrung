package lesson_06_extends_to_java.exercise.Bai01ClassCircleAndClassCylinder.Cylinder;

import lesson_06_extends_to_java.exercise.Bai01ClassCircleAndClassCylinder.Circle.Circle;

public class Cylinder extends Circle {
    private double length = 2.0;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, String color, double length) {
        super(radius, color);
        this.length = length;
    }

    public double getLength(int i) {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume(){
        return getArea() * length;
    }

    @Override
    public String toString() {
        return "Cylinder { " +
                "Length = " + length +
                ", Volume = " + getVolume() +
                '}'+
                super.toString();
    }
}
