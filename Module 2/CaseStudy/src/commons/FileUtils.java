package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String pathFile;
    
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
    public static void setFullPathFile(String fileName) {
        StringBuffer stringBuffer = new StringBuffer("E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\CaseStudy\\src\\data");
        // add name file:
        stringBuffer.append(fileName);
        // add tail file:
        stringBuffer.append(StringUtils.CSV);

        FileUtils.pathFile = pathFile.toString();
    }
}
