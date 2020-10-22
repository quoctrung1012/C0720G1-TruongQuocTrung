package _qly_Sdt.controller;

import _qly_Sdt.commons.*;
import _qly_Sdt.exception.NotFoundPhoneException;
import _qly_Sdt.models.TelephoneDirectory;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNumberPhone {
    public static void deleteNumberPhone() {
        ShowListPhone.showPhone();
        ReadAllFile.readAllFileTelephone();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = null;
        do {
            flag = true;
            try {
                System.out.println("Nhập Số điện thoại");
                phoneNumber = scanner.nextLine();
                Validate.iTestPhoneNumber(phoneNumber);
            } catch (NotFoundPhoneException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        int size = MainMenu.telephoneList.size();
        for (int i = 0; i < size; i++) {
            if (MainMenu.telephoneList.get(i).getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Bạn có muốn xóa số điện thoại này: " + phoneNumber + " khỏi danh bạ không?");
                System.out.println("Nếu đồng ý thì nhập 'Y'.\n Nếu không nhập 'N' ");
                if (scanner.nextLine().equals("Y")) {
                    MainMenu.telephoneList.remove(i);
                    break;
                    //i--;
                } else if (scanner.nextLine().equals("N")) {
                    MainMenu.mainMenu();
                } else {
                    return;
                }
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy số điện thoại" + phoneNumber);
        }
        MainMenu.stringList = new ArrayList<>();
        for (TelephoneDirectory telephone : MainMenu.telephoneList) {
            String line = telephone.getOrderPhone() + MainMenu.COMMA +
                    telephone.getPhoneNumber() + MainMenu.COMMA +
                    telephone.getContactGroup() + MainMenu.COMMA +
                    telephone.getFullName() + MainMenu.COMMA +
                    telephone.getGender() + MainMenu.COMMA +
                    telephone.getAddress() + MainMenu.COMMA +
                    telephone.getBirthday() + MainMenu.COMMA +
                    telephone.getEmail();
            MainMenu.stringList.add(line);
        }

        FileUtils.writeFile(MainMenu.FILE_NAME, MainMenu.stringList);
        ShowListPhone.showPhone();
    }
}
