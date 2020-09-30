package lesson_15_exception_and_debug.exercise.bai_01_su_dung_lop_IllegalTriangleException;

class IllegalTriangleException extends Exception {
    private double side = 1.0;
    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");
    }
    public double getSide1() {
        return side;
    }

}