package lesson_05_access_modifier_and_static_method_and_static_property.practice.Bai02StaticMethodAssignment;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method : gọi method change()

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
