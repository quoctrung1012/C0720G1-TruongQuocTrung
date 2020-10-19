package _00_bai_thi.menu;

import _00_bai_thi.models.Student;

import java.util.Scanner;

public class SearchStudent {
    public static void searchNameStudent() {
        boolean flag = false;
        ReadAllFile.readAllFileStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can tim kiem: ");
        String nameStudent = scanner.nextLine();

        for (Student student : MainMenu.studentList) {
            if (student.getFullName().contains(nameStudent)) {
                System.out.println(student);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("khong tim thay");
        }
    }
}
