package lesson_07_abstract_class_and_interface.practice.bai_01_class_nimal_and_interface_edible.fruit;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
