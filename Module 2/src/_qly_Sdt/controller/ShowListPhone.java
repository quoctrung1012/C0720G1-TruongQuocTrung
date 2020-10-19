package _qly_Sdt.controller;

import _qly_Sdt.models.TelephoneDirectory;

public class ShowListPhone {
    public static void showPhone(){
        ReadAllFile.readAllFileTelephone();
        if (MainMenu.telephoneList.isEmpty()){
            System.out.println("Không có số điện thoại nào trong danh sách");
            return;
        }
        for (TelephoneDirectory telephoneDirectory: MainMenu.telephoneList){
            System.out.println(telephoneDirectory);
        }
    }
//    public static void showA(){
//        ReadAllFile.readAllFileTelephone();
//        if (MainMenu.telephoneList.isEmpty()){
//            System.out.println("Không có số điện thoại nào");
//            return;
//        }
//        int size = MainMenu.telephoneList.size();
//        for (int i = 0; i < size; i++) {
//            for (int j = i; j < 5; j++) {
//                System.out.println(MainMenu.telephoneList.toString());
//
//            }MainMenu.scanner.nextLine();
//        }
//    }
}
