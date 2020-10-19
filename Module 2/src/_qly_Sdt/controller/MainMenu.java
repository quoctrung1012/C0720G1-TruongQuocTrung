package _qly_Sdt.controller;

import _qly_Sdt.models.TelephoneDirectory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static List<String> stringList = new ArrayList<>();
    public static List<TelephoneDirectory> telephoneList = new ArrayList<>();
    public static final String COMMA = ",";
    public static final String FILE_NAME = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\_qly_Sdt\\data\\contacts.csv";
    public static Scanner scanner = new Scanner(System.in);
    static String choose;

    public static void mainMenu() {
        do {
            System.out.println("Nhập sự lựa chọn:\n" +
                    "1.\tThêm\n" +
                    "2.\tHiển thị\n" +
                    "3.\tXóa\n" +
                    "4.\tSửa\n" +
                    "5.\tTìm kiếm\n" +
                    "6.\tThoát");
            System.out.println("Nhập từ 1-6:");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    AddNumberPhone.addNewNumberPhone();
                    break;
                case "2":
                    ShowListPhone.showPhone();
                    break;
                case "3":
                    DeleteNumberPhone.deleteNumberPhone();
                    break;
                case "4":
                    EditPhone.editPhone();
                    break;
                case "5":
                    searchNumberOrName();
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại.");
            }
        } while (true);
    }

    public static void searchNumberOrName() {
        do {
            System.out.println("Nhập sự lựa chọn 1-4\n" +
                    "1.\tTìm kiếm bằng Tên\n" +
                    "2.\tTìm kiếm bằng Số điện thoại\n" +
                    "3.\tQuay lại Menu chính\n" +
                    "4.\tThoát.");
            System.out.println("Nhập sự lựa chọn của bạn:");
            switch (choose) {
                case "1":
                    SearchPhone.searchName();
                    break;
                case "2":
                    SearchPhone.searchPhoneNumber();
                    break;
                case "3":
                    mainMenu();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại.");
            }
            choose = scanner.nextLine();
        } while (true);
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
