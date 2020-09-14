package lesson_04_oop_to_java.exercise.Bai02XayDungLopFan;

public class OOPFan {
    public static void main(String[] args) {
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.showInfo());
        fan2.setSpeed(2);
        System.out.println(fan2.showInfo());
//        Fan fan3 = new Fan();
//        fan3.setSpeed(SLOW);
//        System.out.println(fan3.showInfo());
    }
}
