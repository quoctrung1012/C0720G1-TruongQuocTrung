package _00_bai_thi.menu;

import _00_bai_thi.models.Class;
import _00_bai_thi.models.Student;

public class ShowListStudent {
    public static void showList() {
        ReadAllFile.readAllFileStudent();
        ReadAllFile.readAllFileBatch();
        if (MainMenu.studentList.isEmpty()) {
            System.out.println("Khong co sinh vien nao");
            return;
        }
        for (Student student : MainMenu.studentList) {
            for (Class aClass : MainMenu.classList) {
                if (student.getIdClass() == aClass.getIdClass()) {
                    System.out.println("Lop" + aClass.getNameClass() + " " + student);
                }
            }
//            System.out.println(sinhVien);
        }
    }
}
