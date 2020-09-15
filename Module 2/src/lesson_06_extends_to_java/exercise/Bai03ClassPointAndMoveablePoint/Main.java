package lesson_06_extends_to_java.exercise.Bai03ClassPointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3.0f, 5.0f, 7.0f, 5.0f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
