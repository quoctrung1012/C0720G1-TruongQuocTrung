package case_study_v1.controllers;

import case_study_v1.commons.FileUtils;
import case_study_v1.models.Dictionarys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    String choose;
    Scanner scanner = new Scanner(System.in);
    List<Dictionarys> dictionaryList = new ArrayList<>();
   // static List<String> stringList = new ArrayList<>();
    public final String COMMA = ",";
    public final String FILE_NAME_DICTIONARY = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\case_study_v1\\data\\dictionary.csv";

    public void MainMenu() {
        do {
            System.out.println("--------------------------------------");
            System.out.println("Nhập sự lựa chọn của bạn tù 1-4: " +
                    "\n1.\tNhập từ cần tìm trong từ điển." +
                    "\n2.\tNhập từ cần thêm trong từ điển.." +
                    "\n3.\tXóa từ trong từ điển." +
                    "\n4.\tDanh sách các từ có trong từ điển.");
            System.out.println("--------------------------------------");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    lookupWord();
                    break;
                case "2":
                    addWord();
                    break;
                case "3":
                    deleteWord();
                    break;
                case "4":
                    showListDictionary();
                    break;
                default:
                    System.out.println("Nhập lại sự lựa chọn của bạn!!!");
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= 4);
    }

    private List<Dictionarys> readFileDictionary() {
        List<String> stringList = FileUtils.readFile(FILE_NAME_DICTIONARY);
        for (String string : stringList) {
            List<String> stringListSynonymous = new ArrayList<>();
            String[] stringSplit = string.split(COMMA);
            String[] splitSynonymous = stringSplit[5].split(";");

            for (String synonymous : splitSynonymous) {
                stringListSynonymous.add(synonymous);
            }
            Dictionarys dictionarys = new Dictionarys(stringSplit[0], stringSplit[1], stringSplit[2], stringSplit[3], stringSplit[4], stringListSynonymous);
            dictionaryList.add(dictionarys);
        }
        return dictionaryList;
    }

    private void showListDictionary() {
        dictionaryList = new ArrayList<>();
        int index = 1;
        dictionaryList = readFileDictionary();
        System.out.println("-----------------------------------------------");
        System.out.println("Danh sách các từ có trong từ điển: ");
        for (Dictionarys dictionarys : dictionaryList) {
            System.out.print("No :" + index++ + ":");
            System.out.println(dictionarys.toString());
        }
    }

    private void deleteWord() {
        dictionaryList = readFileDictionary();
        boolean flag = false;
        System.out.print("Nhập từ cần xóa: ");
        int i;
        String inputWordDelete = scanner.nextLine();
        for (i = 0; i < dictionaryList.size(); i++) {
            if (inputWordDelete.equals(dictionaryList.get(i).getWord())) {
                dictionaryList.remove(i);
                System.out.println("Xóa từ thành công");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Xóa ko thành công:");
        }
        FileUtils.writeFile(FILE_NAME_DICTIONARY, dictionaryList.toString());
    }

    private void addWord() {
        Dictionarys dictionarys = new Dictionarys();

        System.out.print("1. Nhập từ cần thêm: ");
        dictionarys.setWord(scanner.nextLine());

        System.out.print("2. Nhập cách phát âm: ");
        dictionarys.setPronoun(scanner.nextLine());

        System.out.print("3. Nhập danh từ:");
        dictionarys.setNoun(scanner.nextLine());

        System.out.print("4. Nhập tính từ: ");
        dictionarys.setAdjective(scanner.nextLine());

        System.out.print("5. Nhập động từ: ");
        dictionarys.setVerb(scanner.nextLine());

        System.out.print("6. Nhập số từ tương đồng: ");
        int numberSynonymous = Integer.parseInt(scanner.nextLine());

        String synonymous = "";
        int index = 1;
        for (int i = 0; i < numberSynonymous; i++) {
            System.out.println("Từ tương đồng thứ " + index++ + " :");
            String a = scanner.nextLine();
            synonymous += a + ";";
        }
        dictionaryList.add(dictionarys);
        String line = null;
        for (Dictionarys writeWord : dictionaryList) {
            line = writeWord.getWord() + COMMA +
                    writeWord.getPronoun() + COMMA +
                    writeWord.getNoun() + COMMA +
                    writeWord.getAdjective() + COMMA +
                    writeWord.getVerb() + COMMA +
                    synonymous;
            FileUtils.writeFile(FILE_NAME_DICTIONARY, line);
        }
    }

    private void lookupWord() {
        showListDictionary();
        System.out.println("Nhập từ cần tìm: ");
        String stringWord = scanner.nextLine();
        boolean flag = false;
//        for (Dictionarys dictionarys : dictionaryList) {
//            if (dictionarys.getWord().equals(stringWord)) {
//                System.out.println(dictionarys);
//                flag = true;
//            }
//        }

        for (int i = 0; i < dictionaryList.size(); i++) {
            if (stringWord.equals(dictionaryList.get(i).getWord())) {
                System.out.println(dictionaryList.get(i).toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("không có trong danh sách");
        }
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.MainMenu();
    }
}
