package lesson_07_abstract_class_and_interface.exercise.bai_02_interface_colorable_cho_cac_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }

    }
    private static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10, 20);
            default:
                return new Circle(10);
        }
    }
}
