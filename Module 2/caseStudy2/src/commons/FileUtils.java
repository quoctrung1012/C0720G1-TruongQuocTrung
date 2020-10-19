package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String pathFile;

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathFile, true));
            bufferedWriter.write(StringUtils.concat(content, StringUtils.COMMA));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile() {
        List<String> arrayContent = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayContent.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayContent;
    }

    public static void  setFullPathFile(String fileName) {
        StringBuffer stringBuffer = new StringBuffer("E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\caseStudy2\\src\\data\\");
        stringBuffer.append(fileName);
        stringBuffer.append(StringUtils.CSV);
        FileUtils.pathFile = stringBuffer.toString();
    }
}
