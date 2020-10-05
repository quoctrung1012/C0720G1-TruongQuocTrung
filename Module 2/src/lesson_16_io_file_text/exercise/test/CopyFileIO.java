package lesson_16_io_file_text.exercise.test;

import java.io.*;

public class CopyFileIO {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_16_io_file_text\\exercise\\test\\file1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_16_io_file_text\\exercise\\test\\file2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        if (true) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
            System.out.println("File is copied successful!");
        } else {
            System.out.println("File is copied unsuccessful!");
        }
    }
}
