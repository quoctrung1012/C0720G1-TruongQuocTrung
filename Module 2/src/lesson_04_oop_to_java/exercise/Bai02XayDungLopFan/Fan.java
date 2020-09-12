package lesson_04_oop_to_java.exercise.Bai02XayDungLopFan;



public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        speed = 10;
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
    public String toString(){
        if (isOn()== on){
            System.out.println("Tốc độ quạt: " + getSpeed() + "\nQuạt có màu: " + getColor() + "\nQuạt đang bật số: " +getRadius());
        }
    }
}
