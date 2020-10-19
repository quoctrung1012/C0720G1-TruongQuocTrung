package _00_bai_thi.menu;

import _00_bai_thi.commons.FileUntil;
import _00_bai_thi.models.Student;
import _00_bai_thi.validate.NotFoundStudentException;
import _00_bai_thi.validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
    public static void deleteStudent() {
        ReadAllFile.readAllFileStudent();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int idStudent = 0;
        do {
            flag = true;
            try {
                System.out.print("Nhap id sinh vien: ");
                idStudent = scanner.nextInt();
                scanner.nextLine();
                Validate.iTestId(idStudent);
            } catch (NotFoundStudentException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        for (int i = 0; i < MainMenu.studentList.size(); i++) {
            if (MainMenu.studentList.get(i).getId() == idStudent) {
                System.out.println("Yes or No");
                if (scanner.nextLine().equals("Yes")) {
                    MainMenu.studentList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }

        MainMenu.listLine = new ArrayList<>();
        for (Student student : MainMenu.studentList) {
            String line = student.getId() + MainMenu.COMA + student.getFullName() + MainMenu.COMA +
                    student.getBirthday() + MainMenu.COMA + student.getGender() + MainMenu.COMA +
                    student.getPhoneNumber() + MainMenu.COMA + student.getIdClass();
            MainMenu.listLine.add(line);
        }

        FileUntil.writeFile(MainMenu.FILE_STUDENT, MainMenu.listLine);
        ShowListStudent.showList();

    }
}
