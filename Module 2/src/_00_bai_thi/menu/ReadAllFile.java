package _00_bai_thi.menu;

import _00_bai_thi.commons.FileUntil;
import _00_bai_thi.models.Teacher;
import _00_bai_thi.models.Class;
import _00_bai_thi.models.Student;

import java.util.ArrayList;
import java.util.List;

public class ReadAllFile {
    public static void readAllFileBatch() {
        MainMenu.listLine = FileUntil.readFile(MainMenu.FILE_BACTCHS);
        MainMenu.classList = new ArrayList<>();
        for (String line : MainMenu.listLine) {
            String[] split = line.split(",");
            Class aClass = new Class(Integer.parseInt(split[0]), split[1], split[2]);
            MainMenu.classList.add(aClass);
        }
    }

    public static void readAllFileStudent() {
        MainMenu.listLine = FileUntil.readFile(MainMenu.FILE_STUDENT);
        MainMenu.studentList = new ArrayList<>();
        for (String line : MainMenu.listLine) {
            String[] split = line.split(",");
            Student student = new Student(Integer.parseInt(split[0]), split[1],
                    split[2], split[3], split[4], Integer.parseInt(split[5]));
            MainMenu.studentList.add(student);
        }
    }

    public static void readAllFileTeacher() {
        MainMenu.listLine = FileUntil.readFile(MainMenu.FILE_TEACHER);
        List<Teacher> teacherList = new ArrayList<>();
        for (String line : MainMenu.listLine) {
            String[] split = line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(split[0]),
                    split[1], split[2], split[3], split[4]);
            teacherList.add(teacher);
        }
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
