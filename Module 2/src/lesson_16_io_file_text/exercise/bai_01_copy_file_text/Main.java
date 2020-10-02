package lesson_16_io_file_text.exercise.bai_01_copy_file_text;

import java.util.*;

import static lesson_16_io_file_text.exercise.bai_01_copy_file_text.WriteReadCopy.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input content");
        String string = scanner.nextLine();

        writeFile(PATH_FILE_1,string);

        copyFIleTxt();
        System.out.println("Content copy");
        List<String> stringList = WriteReadCopy.readFile(PATH_FILE_2);
        for (String list : stringList){
            System.out.println(list);
        }
    }

}
