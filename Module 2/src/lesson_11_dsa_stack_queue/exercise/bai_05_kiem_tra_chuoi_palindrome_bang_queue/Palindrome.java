package lesson_11_dsa_stack_queue.exercise.bai_05_kiem_tra_chuoi_palindrome_bang_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}


