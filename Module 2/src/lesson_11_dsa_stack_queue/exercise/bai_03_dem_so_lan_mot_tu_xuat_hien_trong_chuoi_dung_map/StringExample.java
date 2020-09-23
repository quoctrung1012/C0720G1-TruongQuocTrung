package lesson_11_dsa_stack_queue.exercise.bai_03_dem_so_lan_mot_tu_xuat_hien_trong_chuoi_dung_map;

import java.util.Map;
import java.util.TreeMap;

public class StringExample {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char ENTER = '\n';

    public static Map<String, Integer> countWords(String input){
        Map<String,Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null){
            return wordMap;
        }
        //int size = input.length();
        StringBuilder stringBuilder =new StringBuilder();
        for (int i=0;i<input.length();i++){
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != ENTER){
                stringBuilder.append(input.charAt(i));
            }   else {
                addWord(wordMap,stringBuilder);
                stringBuilder = new StringBuilder();
            }
        }
        addWord(wordMap,stringBuilder);
        return wordMap;
    }
    public static void addWord(Map<String, Integer> wordMap, StringBuilder stringBuilder) {
        String word = stringBuilder.toString();
        if (word.length() ==0){
            return;
        }   if (wordMap.containsKey(word)){
            int count = wordMap.get(word) +1;
            wordMap.put(word,count);
        }   else {
            wordMap.put(word,1);
        }
    }
    public static void main(String[] args) {
        String string = "Chương trình được tại CodeGym được thiết kế "+
                "\ndành cho người không biết gì về ngành CNTT và Lập trình," +
                "\nbắt đầu với những việc nhỏ nhất như gõ bàn phím," +
                "\ncài đặt phần mềm, tìm kiếm thông tin" ;
        System.out.println(string);
        System.out.println();
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = countWords(string);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\t");
        }
    }
}
