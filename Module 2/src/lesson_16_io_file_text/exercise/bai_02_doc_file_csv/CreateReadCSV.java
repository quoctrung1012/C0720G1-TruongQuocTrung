package lesson_16_io_file_text.exercise.bai_02_doc_file_csv;

import java.io.*;

public class CreateReadCSV {
    private static final String FILE_PATH = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_16_io_file_text\\exercise\\bai_02_doc_file_csv\\data\\file.csv";
    private static final String COMMON = ",";
    private static BufferedReader bufferedReader;


    public static void readFile() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] county = line.split(COMMON);
                System.out.println("County [ " +
                        "Ip Address: " + county[0] +
                        ", Ip Network: " + county[1] +
                        ", IP2-Location: from " + county[2] + " to " + county[3] +
                        ", Id-Location: " + county[4] +
                        ", Name-Location: " + county[5] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   finally {
            if (bufferedReader !=null){
                try {
                    bufferedReader.close();
                }   catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
