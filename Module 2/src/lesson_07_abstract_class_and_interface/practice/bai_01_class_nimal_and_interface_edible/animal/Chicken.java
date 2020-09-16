package lesson_07_abstract_class_and_interface.practice.bai_01_class_nimal_and_interface_edible.animal;

import lesson_07_abstract_class_and_interface.practice.bai_01_class_nimal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}