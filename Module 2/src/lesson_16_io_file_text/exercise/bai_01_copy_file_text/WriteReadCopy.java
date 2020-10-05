package lesson_16_io_file_text.exercise.bai_01_copy_file_text;

import java.io.*;
import java.util.*;

public class WriteReadCopy {
    protected static final String PATH_FILE_1 = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_16_io_file_text\\exercise\\data\\file_test_1.txt";
    protected static final String PATH_FILE_2 = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_16_io_file_text\\exercise\\data\\file_test_2.txt";

    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    public static void copyFIleTxt() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            if (true) {
                inputStream = new FileInputStream(new File(PATH_FILE_1));
                outputStream = new FileOutputStream(new File(PATH_FILE_2));
                int length;
                byte[] buffer = new byte[1024];
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                System.out.println("File is copied successful!");
            } else {
                System.out.println("File is copied unsuccessful!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
