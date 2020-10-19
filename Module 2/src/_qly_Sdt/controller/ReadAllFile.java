package _qly_Sdt.controller;

import _qly_Sdt.commons.FileUtils;
import _qly_Sdt.models.TelephoneDirectory;

import java.util.ArrayList;

public class ReadAllFile {
    public static void readAllFileTelephone() {
        MainMenu.stringList = FileUtils.readAllFile(MainMenu.FILE_NAME);
        MainMenu.telephoneList = new ArrayList<>();
        for (String string : MainMenu.stringList) {
            String[] stringSlit = string.split(MainMenu.COMMA);
            TelephoneDirectory telephoneDirectory = new TelephoneDirectory(Integer.parseInt(stringSlit[0]), stringSlit[1],
                    stringSlit[2], stringSlit[3], stringSlit[4], stringSlit[5], stringSlit[6],stringSlit[7]);
            MainMenu.telephoneList.add(telephoneDirectory);
        }
    }
}
