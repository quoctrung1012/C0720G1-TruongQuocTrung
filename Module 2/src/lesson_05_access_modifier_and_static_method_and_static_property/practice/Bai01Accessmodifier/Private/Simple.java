package lesson_05_access_modifier_and_static_method_and_static_property.practice.Bai01Accessmodifier.Private;

//cách dùng sai
//class A {
//    private int data = 40;
//    private void msg() {
//        System.out.println("Hello java");
//    }
//
//}
//public class Simple {
//    public static void main(String args[]) {
//        A obj = new A();
//        System.out.println(obj.data);//Compile Time Error
//        obj.msg();//Compile Time Error
//    }
//}
//Cách dùng đúng
 class Simple {
    private int data = 40;
    private void msg() {
        System.out.println("Hello java");
    }
    public static void main(String args[]) {
        Simple obj = new Simple();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}