package lesson_13_thua_toan_tim_kiem.exercise;

import java.util.LinkedList;
import java.util.Scanner;
public class bai_03_tim_chuoi_lien_tiep_co_do_dai_lon_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Find the maximum consecutive increasingly ordered substring
        for (int i = 0; i < string.length(); i++) { 		// single loop
            boolean condition = list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i));
            if (condition) {
                list.clear(); // Simple statement
            }

            list.add(string.charAt(i)); // Simple statement

            if (list.size() > max.size()) { // Simple statement
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character: max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
