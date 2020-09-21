package lesson_10_dsa_array_list.exercise.bai_02_trien_khai_cac_phuong_thuc_cua_linked_list_theo_thu_vien_java.util.ArrayList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Nam1");
        Student student2 = new Student(2, "Nam2");
        Student student3 = new Student(3, "Nam3");
        Student student4 = new Student(4, "Nam4");
        Student student5 = new Student(5, "Nam5");
        //thêm phần tử đầu bằng addFirst()
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        //thêm phần tử cuối bằng addLast()
        myLinkedList.addLast(student3);
        //thêm phần tử ở vị trí index bằng add()
        myLinkedList.add(3, student4);
        //xóa phần tử ở vị trí index bằng remove()
//        myLinkedList.remove(3);
        //xóa phần tử element trong danh sách bằng hàm remove(element), với ví dụ element là student2
//        myLinkedList.remove(student2);
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println("danh sách mới:");
        //sao chép danh sách mới từ danh sách cũ.
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println("Kiểm tra xem phần tử có trong danh sách hay ko");
        //kiểm tra một phần tử có ở trong danh sách hay ko, kq True/False
        boolean result1 = myLinkedList.constrains(student2);//kq true
        boolean result2 = myLinkedList.constrains(student5);//kq false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("vị trí element muốn tìm là: ");
        //kiểm phần tử có trong danh sách hay ko và cho vị trí kq là vị trí element hoặc -1(nếu ko có)
        System.out.println(myLinkedList.indexOf(student2));//kq 0
        System.out.println(myLinkedList.indexOf(student5));//kq -1


    }
}
