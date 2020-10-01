package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException.triangle_3;

public class ShapeTriangle {
    double side1,side2,side3;

    public ShapeTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 <= 0 || side2 <= 0 ||side3 <= 0){
            throw new ArithmeticException();
        }if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2){
            throw new IllegalTriangleException("Is a Triangle");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ShapeTriangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
