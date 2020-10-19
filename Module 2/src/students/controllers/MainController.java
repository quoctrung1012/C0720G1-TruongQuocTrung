package students.controllers;

import students.commons.FileUtils;
import students.models.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    final Scanner scanner = new Scanner(System.in);
    String choose;
    public final String COMMA = ",";
    final String FILE_NAME  = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\students\\data\\student.csv";
    List<Students> studentsList = new ArrayList<>();
    String idStudent;

    public void MainMenuStudent() {
        do {
            System.out.println("Nhập số từ 1 đến 7: \n" +
                    "1.\tThêm thông tin sinh viên vào danh sách.\n" +
                    "2.\tTìm kiếm sinh viên trong danh sách.\n" +
                    "3.\tSửa thông tin sinh viên trong danh sách.\n" +
                    "4.\tXóa thông tin sinh viên trong danh sách.\n" +
                    "5.\tHiển thị danh sách sinh viên.\n" +
                    "6.\tThoát chương trình.");
            System.out.print("Nhập sự lựa chọn của bạn:");
            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    addInformationStudent();
                    break;
                case "2":
                    idStudent = inputIdStudent();
                    searchInformationStudent(idStudent);
                    break;
                case "3":
//                    idStudent = inputIdStudent();
//                    repairInformationStudent(idStudent);
                    break;
                case "4":
                    idStudent = inputIdStudent();
//                    deleteInformationStudent(idStudent);
                    break;
                case "5":
                    showInformationStudent();
                    break;
                case "6":
                    System.exit(0);
                    System.out.println("Kết thúc chương trình.");
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= 6);
    }

    private List<Students> readFileStudent() {

        List<String> stringList = FileUtils.readFile(FILE_NAME);
        studentsList = new ArrayList<>();

        String[] arrayStudents = null;
        Students students = null;
        for (String properties : stringList) {
            arrayStudents = properties.split(COMMA);
            students = new Students();
            students.setIdStudent(arrayStudents[0]);
            students.setNameStudent(arrayStudents[1]);
            students.setBirthdayStudent(arrayStudents[2]);
            students.setEmailStudent(arrayStudents[3]);
            students.setIdCardStudent(arrayStudents[4]);
            students.setAddressStudent(arrayStudents[5]);

            studentsList.add(students);
        }
        return studentsList;
    }

    private void searchInformationStudent(String idInputStudent) {
        boolean isRepair = false;
        int size = studentsList.size();
        for (int i = 0; i < size; i++) {
            if (idInputStudent.equals(studentsList.get(i).getIdStudent())) {
                isRepair = true;
                System.out.println(studentsList.get(i).toString());
                break;
            }
        }
        if (!isRepair){
            System.out.println("Không tìm thấy id sinh viên trong danh sách:");
        }else {

        }
    }

    private void addInformationStudent() {

        String nameStudent;
        String birthdayStudent;
        String emailStudent;
        String idCardStudent;
        String addressStudent;

        idStudent = inputIdStudent();
        nameStudent = inputNameStudent();
        birthdayStudent = inputBirthdayStudent();
        emailStudent = inputEmailStudent();
        idCardStudent = inputIdCardStudent();
        addressStudent = inputAddressStudent();

        Students students = new Students(idStudent, nameStudent, birthdayStudent, emailStudent, idCardStudent, addressStudent);
        studentsList.add(students);
        String line = null;
        for (Students writeStudent: studentsList){
            line = writeStudent.getIdStudent() + COMMA +
                    writeStudent.getNameStudent() + COMMA +
                    writeStudent.getBirthdayStudent() + COMMA +
                    writeStudent.getEmailStudent() + COMMA +
                    writeStudent.getIdCardStudent() + COMMA +
                    writeStudent.getAddressStudent();
        }
        FileUtils.writeFileV1(FILE_NAME,line);

    }

//    private void repairInformationStudent(String idInputStudent) {
//        boolean isRepair = false;
////        int size = ;
//        for (int i = 0; i < studentsList.size(); i++) {
//            if (idInputStudent.equals(studentsList.get(i).getIdStudent())) {
//                isRepair = true;
//                studentsList.get(i).setIdStudent(inputIdStudent());
//                studentsList.get(i).setNameStudent(inputNameStudent());
//                studentsList.get(i).setBirthdayStudent(inputBirthdayStudent());
//                studentsList.get(i).setEmailStudent(inputEmailStudent());
//                studentsList.get(i).setIdCardStudent(inputIdCardStudent());
//                studentsList.get(i).setAddressStudent(inputAddressStudent());
//                break;
//            }
//        }
//        if (!isRepair) {
//            System.out.println("Không tìm thấy id sinh viên trong danh sách:");
//        } else {
//            FileUtils.writeFileV2(FILE_NAME, studentsList);
//        }
//    }
//public static void editInforStudent(){
//    showListStudent();
//    System.out.println("1. Nhap sinh vien muon thay doi");
//    String input = scanner.nextLine();
//    System.out.println("1. Ma sinh vien: " + studentList.get(Integer.parseInt(input) - 1).getId() + "\n" +
//            "2. Ten sinh vien: " + studentList.get(Integer.parseInt(input) - 1).getName() + "\n" +
//            "3. Ngay sinh: " + studentList.get(Integer.parseInt(input) - 1).getBirthday() + "\n" +
//            "4. Quay lai menu");
//    System.out.println("Nhap thong tin can thay doi");
//    int choose = scanner.nextInt();
//    scanner.nextLine();
//    switch (choose) {
//        case 1:
//            System.out.println("Nhap lai id moi");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            studentList.get(Integer.parseInt(input) - 1).setId(id);
//            System.out.println("thay doi thanh cong");
//            break;
//        case 2:
//            System.out.println("Nhap lai ten moi");
//            String name = scanner.nextLine();
//            studentList.get(Integer.parseInt(input) - 1).setName(name);
//            System.out.println("thay doi thanh cong");
//            break;
//        case 3:
//            boolean flag = false;
//            String age = null;
//            do {
//                flag = true;
//                try {
//                    System.out.println("Nhap tuoi moi");
//                    age = scanner.nextLine();
//                    validBirthday(age);
//                } catch (ValidBirthday e) {
//                    System.err.println(e.getMessage());
//                    flag = false;
//                }
//            } while (!flag);
//            studentList.get(Integer.parseInt(input) - 1).setBirthday(age);
//            System.out.println("thay doi thanh cong");
//            break;
//        default:
//            mainMenu();
//    }
//    updateFile();
//}

//    private void deleteInformationStudent(String idInputStudent) {
//        Students students = null;
//        int size = studentsList.size();
//        for (int i = 0; i < size; i++) {
//            if (idInputStudent.equals(studentsList.get(i).getIdStudent())) {
//                students = studentsList.get(i);
//                break;
//            }
//        }
//        boolean flag = students != null;
//        if (flag) {
//            studentsList.remove(students);
//            FileUtils.writeFileV2(FILE_NAME, String.valueOf(studentsList));
//        } else {
//            System.out.println("Không tìm thấy id vừa nhập");
//        }
//    }

    private void showInformationStudent() {
        System.out.println("-------------------------------------");
        System.out.println("Danh sách sinh viên hiện có :");
        studentsList = readFileStudent();
        Students students = null;
        for (int i = 0; i < studentsList.size(); i++) {
            students = studentsList.get(i);
            System.out.println("No." + (i + 1) + ". ");
            System.out.println(students);
        }
    }

    private String inputIdStudent() {
        System.out.println("Nhập ID của sinh viên: ");
        String idStudent = scanner.nextLine();
        return idStudent;
    }

    private String inputNameStudent() {
        System.out.println("Nhập Họ và Tên sinh viên: ");
        String nameStudent = scanner.nextLine();
        return nameStudent;
    }

    private String inputBirthdayStudent() {
        System.out.println("Nhập ngày tháng năm sinh sinh viên: ");
        String birthdayStudent = scanner.nextLine();
        return birthdayStudent;
    }

    private String inputEmailStudent() {
        System.out.println("Nhập email sinh viên: ");
        String emailStudent = scanner.nextLine();
        return emailStudent;
    }

    private String inputIdCardStudent() {
        System.out.println("Nhập số CMND của sinh viên: ");
        String idCardStudent = scanner.nextLine();
        return idCardStudent;
    }

    private String inputAddressStudent() {
        System.out.println("Nhập địa chỉ của sinh viên: ");
        String addressStudent = scanner.nextLine();
        return addressStudent;
    }
}
