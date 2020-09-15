package lesson_05_access_modifier_and_static_method_and_static_property.practice.Bai03StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars + " " + car1.getName() + " " + car1.getEngine());
        Car car2 = new Car();
        car2.setName("Mazda 6");
        car2.setEngine("Skyactiv 6");
        System.out.println(Car.numberOfCars + " " + car2.getName() + " " + car2.getEngine());
    }
}
