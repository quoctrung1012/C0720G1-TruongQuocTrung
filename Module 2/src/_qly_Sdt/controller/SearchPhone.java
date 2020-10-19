package _qly_Sdt.controller;

import _qly_Sdt.models.TelephoneDirectory;

public class SearchPhone {
    static boolean flag = false;
    public static void searchPhoneNumber() {
        ReadAllFile.readAllFileTelephone();

        System.out.println("Nhập số điện thoại cần tìm kiếm thông tin:");
        String phoneNumber = AddNumberPhone.inputNumberPhone();

        for (TelephoneDirectory telephone : MainMenu.telephoneList) {
            if (telephone.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(telephone);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy trong danh sách");
        }
    }

    public static void searchName() {
        ReadAllFile.readAllFileTelephone();
        String fullName = AddNumberPhone.fullName();

        for (TelephoneDirectory telephone: MainMenu.telephoneList){
            if (telephone.getFullName().equals(fullName)){
                System.out.println(telephone);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy trong danh sách");
        }
    }
}
