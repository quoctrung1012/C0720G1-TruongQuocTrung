package lesson_05_access_modifier_and_static_method_and_static_property.practice.Bai02StaticMethodAssignment;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable : hàm khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable : phương thức static để thay đổi giá trị của biến static từ "BBDIT" thành "CODEGYM"
    static void change() {
        college = "CODEGYM";
    }

    //method to display values : phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
