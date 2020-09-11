package lesson_04_oop_to_java.practice;

import java.util.Scanner;

public class Bai01LopHinhChuNhat {
    //Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
    public static class Rectangle {
        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        //code below here
        //Bước 2: Định nghĩa các phương thức getArea(), getPerimeter(), display()
        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }

    //Bước 3: Tạo class chứa phương thức main để thực thi chương trình
    public static void main(String[] args) {
        //code below here
        // Bước 4: Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        //Bước 5: Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);

        //Bước 6: Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiển thị các thông số của hình chữ nhật
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

