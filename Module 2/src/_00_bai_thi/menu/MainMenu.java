package _00_bai_thi.menu;

import _00_bai_thi.models.Class;
import _00_bai_thi.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static List<Student> studentList = new ArrayList<>();
    public static List<String> listLine = new ArrayList<>();
    public static List<Class> classList = new ArrayList<>();
    public static final String COMA = ",";
    public static final String FILE_STUDENT = "_00_bai_thi\\data\\student.csv";
    public static final String FILE_BACTCHS = "_00_bai_thi\\data\\bacths.csv";
    public static final String FILE_TEACHER = "_00_bai_thi\\data\\teacher.csv";

    public static void mainMenu() {
        String choose;
        do {
            System.out.println("1. Them moi sinh vien.");
            System.out.println("2. Xoa sinh vien.");
            System.out.println("3. Xem danh sach sinh vien.");
            System.out.println("4. Xem thong tin giao vien.");
            System.out.println("5. Tim kiem sinh vien.");
            System.out.println("6. Thoat.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lua chon cua ban: ");
            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    AddStudent.addNewStudent();
                    break;
                case "2":
                    DeleteStudent.deleteStudent();
                    break;
                case "3":
                    ShowListStudent.showList();
                    break;
                case "4":
                    ReadAllFile.readAllFileTeacher();
                    break;
                case "5":
                    SearchStudent.searchNameStudent();
                    break;
                case "6":
                    return;
                default:
                    mainMenu();
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 7);
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
