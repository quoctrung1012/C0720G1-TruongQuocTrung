package _00_bai_thi.menu;

import _00_bai_thi.commons.FileUntil;
import _00_bai_thi.models.Class;
import _00_bai_thi.models.Student;
import _00_bai_thi.validate.BirthdayException;
import _00_bai_thi.validate.NumberPhoneException;
import _00_bai_thi.validate.NameException;
import _00_bai_thi.validate.Validate;

import java.util.Scanner;

public class AddStudent {
    public static void addNewStudent() {
        ReadAllFile.readAllFileBatch();
        ReadAllFile.readAllFileStudent();
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int idStudent = 0;
        idStudent = (MainMenu.studentList.size() == 0) ? 1 : idStudent + (MainMenu.studentList.get(MainMenu.studentList.size() - 1).getId() + 1);
        String nameStudent = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap ten sinh vien: ");
                nameStudent = scanner.nextLine();
                Validate.iTestName(nameStudent);
            } catch (NameException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String birthday = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap ngay sinh: ");
                birthday = scanner.nextLine();
                Validate.iTestBirthday(birthday);
            } catch (BirthdayException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);


        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();


        String phoneNumber = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap so dien thoai: ");
                phoneNumber = scanner.nextLine();
                Validate.iTestPhoneNumber(phoneNumber);
            } catch (NumberPhoneException e) {
                e.printStackTrace();
                flag = false;
            }

            for (Student student : MainMenu.studentList) {
                if (student.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("So dien thoai da ton tai !!!");
                    flag = false;
                    break;
                }
            }
        } while (!flag);

        int idClass;
        do {
            flag = false;
            System.out.print("Nhap ma lop hoc: ");
            idClass = scanner.nextInt();
            for (Class aClass : MainMenu.classList) {
                if (aClass.getIdClass() == idClass) {
                    flag = true;
                    break;
                }
            }
            System.out.println("Ma lop hoc khong ton tai");
        } while (!flag);


        Student student = new Student(idStudent, nameStudent, birthday, gender, phoneNumber, idClass);

        String line = student.getId() + MainMenu.COMA + student.getFullName() + MainMenu.COMA +
                student.getBirthday() + MainMenu.COMA + student.getGender() + MainMenu.COMA +
                student.getPhoneNumber() + MainMenu.COMA + student.getIdClass();

        MainMenu.listLine = FileUntil.readFile(MainMenu.FILE_STUDENT);
        MainMenu.listLine.add(line);
        FileUntil.writeFile(MainMenu.FILE_STUDENT, MainMenu.listLine);
        System.out.println("Them thanh cong");
    }


}
