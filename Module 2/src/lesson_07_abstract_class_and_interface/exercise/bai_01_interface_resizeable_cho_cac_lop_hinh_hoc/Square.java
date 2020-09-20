package lesson_07_abstract_class_and_interface.exercise.bai_01_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return side *4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Perimeter="
                + getPerimeter()
                + ", Area="
                + getArea();
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}