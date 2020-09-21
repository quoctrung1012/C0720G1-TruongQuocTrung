package lesson_10_dsa_array_list.exercise.bai_01_trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java.util.ArrayList;

public class MyListTest {
    public static class Student {
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

    public static void main(String[] args) {
        Student student01 = new Student(1, "huy1");
        Student student02 = new Student(2, "huy2");
        Student student03 = new Student(3, "huy3");
        Student student04 = new Student(4, "huy4");
        Student student05 = new Student(5, "huy5");
        Student student06 = new Student(6, "huy6");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student01);
        studentMyList.add(student02);
        studentMyList.add(student03);
        studentMyList.add(student04);
        studentMyList.add(student05);
        //kiểm tra phương thức add 1 element vào 1 vị trí index
        // studentMyList.add(student06,2);
        studentMyList.size();
        // kiểm tra phương thức clear
        //studentMyList.clear();
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.print(student.getId() + " ");
            System.out.println(student.getName());
        }
        System.out.println("kiểm tra size()");
        System.out.println(studentMyList.size());
        System.out.println("kiểm tra get()");
        //kiểm trrea phương thức get(), lấy ra phần tử thứ index
        System.out.println("Name: " + studentMyList.get(3).getName());
        System.out.println("kiểm tra indexOf , nếu có thì có kq vị trí , không thì -1");
        // Kiểm tra phương thức indexOf, tìm vị trí của một element trong array MyList
        System.out.println(studentMyList.indexOf(student04));// kiểm tra có
        System.out.println(studentMyList.indexOf(student06));// kiểm tra ko có
        System.out.println("kiểm tra contains, xem thử phần tử nào đó có có trong mảng ko, kq nếu có/không thì là true/false ");
        //kiểm tra contains, xem thử phần tử nào đó có có trong mảng ko, kq nếu có/không thì là true/false
        System.out.println(studentMyList.contains(student03));
        System.out.println(studentMyList.contains(student06));
        System.out.println("sao chép mảng cũ sang mảng mới");
        // phương thức clone, tạo mảng mới với số phần tử của mảng cũ và sao chép tất cả element mảng cũ sang mảng mới
        MyList<Student> newMyList = new MyList<>();
        newMyList = studentMyList.clone();
        for (int i = 0; i < newMyList.size; i++) {
            System.out.print("id: " + newMyList.get(i).getId() + " ");
            System.out.println(newMyList.get(i).getName());
        }
        System.out.println("xóa phần tử từ vị trí index bằng remove()");
        //phương thức remove, xóa phần tử thứ index khỏi mảng.
        newMyList.remove(2);
        for (int i = 0; i < newMyList.size; i++) {
            System.out.print("id: " + newMyList.get(i).getId() + " ");
            System.out.println(newMyList.get(i).getName());
        }
        //in ra phần tử đã xóa.
        System.out.println("In ra phần tử index đã xóa.");
        Student student = newMyList.remove(2);
        System.out.println("id: " + student.getId() + " " + student.getName());
    }
}
