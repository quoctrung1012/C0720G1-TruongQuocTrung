package bai_thi_module.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {


    public static void writeFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(pathFile,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: listLine) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static List<String> readFile(String pathFile) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> listLine = new ArrayList<>();
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
