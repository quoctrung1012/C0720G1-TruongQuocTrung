package lesson_11_dsa_stack_queue.exercise.bai_04_chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;

public class Main {
    public static final Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số cần điền");
        int decimalNumber = scaner.nextInt();
        //int decimalNumber = 123456789;
        System.out.println("Hệ nhị phân của: " + decimalNumber + " là");
        new ConverNumber().decimalToBinary(decimalNumber);


    }



}
