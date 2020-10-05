package lesson_17_io_binary_file_and_serialization.exercise.bai_02_copy_file_nhi_phan;

import java.io.*;

public class CopyBinary {
    protected static final String PATH_FILE_1 = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_17_io_binary_file_and_serialization\\exercise\\bai_02_copy_file_nhi_phan\\data\\test1.txt";
    protected static final String PATH_FILE_2 = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_17_io_binary_file_and_serialization\\exercise\\bai_02_copy_file_nhi_phan\\data\\test2.txt";
    InputStream inputStream = null;
    OutputStream outputStream = null;

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

    public static void main(String[] args) {
        copyFIleTxt();
    }
}

