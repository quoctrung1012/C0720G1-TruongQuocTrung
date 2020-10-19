package _qly_Sdt.controller;


import _qly_Sdt.commons.*;
import _qly_Sdt.exception.*;
import _qly_Sdt.models.*;

import java.util.Scanner;

public class AddNumberPhone {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean flag;
    static String phoneNumber = null;
    static String contactGroup = null;
    static String fullName = null;
    static String gender = null;
    static String address = null;
    static String birthday = null;
    static String email = null;

    public static void addNewNumberPhone() {
        ReadAllFile.readAllFileTelephone();

        int phoneOrderNumber = 0;
        phoneOrderNumber = (MainMenu.telephoneList.size() == 0) ? 1 : phoneOrderNumber + (MainMenu.telephoneList.get(MainMenu.telephoneList.size() - 1).getOrderPhone() + 1);

        phoneNumber = numberPhone();
        contactGroup = contactGroup();
        fullName = fullName();
        gender = gender();
        address = address();
        birthday = birthday();
        email = email();

        TelephoneDirectory telephone = new TelephoneDirectory(phoneOrderNumber, phoneNumber, contactGroup, fullName, gender, address, birthday, email);
        String line = telephone.getOrderPhone() + MainMenu.COMMA +
                telephone.getPhoneNumber() + MainMenu.COMMA +
                telephone.getContactGroup() + MainMenu.COMMA +
                telephone.getFullName() + MainMenu.COMMA +
                telephone.getGender() + MainMenu.COMMA +
                telephone.getAddress() + MainMenu.COMMA +
                telephone.getBirthday() + MainMenu.COMMA +
                telephone.getEmail();

        MainMenu.stringList = FileUtils.readAllFile(MainMenu.FILE_NAME);
        MainMenu.stringList.add(line);
        FileUtils.writeFile(MainMenu.FILE_NAME, MainMenu.stringList);
        System.out.println("Nhập thông tin thành công:");
    }

    public static String email() {
        do {
            flag = true;
            try {
                System.out.println("7.\tNhập địa chỉ email: ");
                email = scanner.nextLine();
                if (email == "") {
                    System.out.println("Nhap lai:");
                    flag = false;
                }
                Validate.iRegexEmail(email);
            } catch (ExceptionEmail e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);
        return email;
    }

    public static String birthday() {
        do {
            flag = true;
            try {
                System.out.println("6.\tNhập ngày sinh của " + fullName);
                birthday = scanner.nextLine();
                Validate.iRegexBirthday(birthday);
            } catch (ExceptionBirthday e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);
        return birthday;
    }

    public static String address() {
        do {
            flag = true;
            try {
                System.out.println("5.\tNhập địa chỉ của " + fullName);
                address = scanner.nextLine();
                Validate.iRegexString(address);
            } catch (ExceptionName e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);
        return address;
    }

    public static String gender() {
        do {
            flag = true;
            try {
                System.out.println("4.\tNhập giới tính của người " + fullName);
                gender = scanner.nextLine();
                Validate.iRegexString(gender);
            } catch (ExceptionName e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);
        return gender;
    }

    public static String fullName() {
        do {
            flag = true;
            try {
                System.out.println("3.\tNhập Tên người đang dùng số điện thoại " + phoneNumber);
                fullName = scanner.nextLine();
                Validate.iRegexString(fullName);
            } catch (ExceptionName e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        return fullName;
    }

    public static String contactGroup() {
        do {
            flag = true;
            try {
                System.out.println("2.\tNhập Tên nhóm điện thoại: ");
                contactGroup = scanner.nextLine();
                Validate.iRegexString(contactGroup);
            } catch (ExceptionName e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        return contactGroup;
    }

    public static String numberPhone() {
        do {
            flag = true;
            try {
                System.out.println("1.\tNhập số điện thoại: ");
                phoneNumber = scanner.nextLine();
                Validate.iRegexPhoneNumber(phoneNumber);
            } catch (ExceptionPhone e) {
                e.printStackTrace();
                flag = false;
            }
            for (TelephoneDirectory telephone : MainMenu.telephoneList) {
                if (telephone.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("Số điện thoại đã tồn tại!!!");
                    flag = false;
                    break;
                }
            }
        } while (!flag);
        return phoneNumber;
    }
    public static String inputNumberPhone(){
        do {
            flag = true;
            try {
                System.out.println("1.\tNhập số điện thoại: ");
                phoneNumber = scanner.nextLine();
                Validate.iRegexPhoneNumber(phoneNumber);
            } catch (ExceptionPhone e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        return phoneNumber;
    }
}
