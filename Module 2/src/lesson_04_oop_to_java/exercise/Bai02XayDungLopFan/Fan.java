package lesson_04_oop_to_java.exercise.Bai02XayDungLopFan;

public class Fan {
    //Cách 1:
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //Cách 2:
//    int SLOW = 1;
//    int MEDIUM = 2;
//    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String showInfo(){
        if (this.isOn()){
            return "Quạt đang bật. \nTốc độ quạt: " + getSpeed() + "\nQuạt có màu: " + getColor() + "\nQuạt đang bật số: " +getRadius();
        }
        else {
            return "Quạt đang tắt. \nTốc độ quạt: " + getSpeed() + "\nQuạt có màu: " + getColor() + "\nQuạt đang bật số: " +getRadius();
        }
    }
}
