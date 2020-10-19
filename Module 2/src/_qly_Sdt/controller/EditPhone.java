package _qly_Sdt.controller;

import _qly_Sdt.commons.FileUtils;
import _qly_Sdt.models.TelephoneDirectory;

import java.util.ArrayList;

public class EditPhone {
    public static void editPhone() {
        ShowListPhone.showPhone();
        System.out.println("Nhập số điện thoại muốn thay đổi:");
        String phoneNumber = AddNumberPhone.inputNumberPhone();
        boolean flag = false;

        int size = MainMenu.telephoneList.size();
        for (int i = 0; i < size; i++) {
            if (MainMenu.telephoneList.get(i).getPhoneNumber().equals(phoneNumber)) {
                flag = true;

                System.out.println("Bạn có muốn chỉnh sửa số điện thoại này: " + phoneNumber + " không?");
//                System.out.println("Nếu đồng ý thì nhập 'Y'.\n Nếu không nhập 'N' ");
//                if (MainMenu.scanner.nextLine().equals("Y")) {
                MainMenu.telephoneList.get(i).setPhoneNumber(AddNumberPhone.numberPhone());
                MainMenu.telephoneList.get(i).setContactGroup(AddNumberPhone.contactGroup());
                MainMenu.telephoneList.get(i).setFullName(AddNumberPhone.fullName());
                MainMenu.telephoneList.get(i).setGender(AddNumberPhone.gender());
                MainMenu.telephoneList.get(i).setAddress(AddNumberPhone.address());
                MainMenu.telephoneList.get(i).setBirthday(AddNumberPhone.birthday());
                MainMenu.telephoneList.get(i).setEmail(AddNumberPhone.email());

                System.out.println("Sửa thông tin số điện thoại thành công");
                break;
            }
//            } else if (MainMenu.scanner.nextLine().equals("N")) {
//                MainMenu.mainMenu();
//            } else {
//                return;
//            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy số điện thoại cần xóa!!!");
        } else {
            updateFile();
            ShowListPhone.showPhone();
        }
    }

    public static void updateFile() {
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
    }
}
