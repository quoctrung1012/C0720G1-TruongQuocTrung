package lesson_06_extends_to_java.practice.Bai01HeCacHinhHoc.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
