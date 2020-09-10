package lesson_01_introduction_to_java.exercise;

import java.util.Scanner;

public class Bai02UngDungDocSoThanhChu {

    static String read1To10(int number) {
        String say = "";
        switch(number) {
            case 1:
                say = "one";
                break;
            case 2:
                say = "two";
                break;
            case 3:
                say = "three";
                break;
            case 4:
                say = "four";
                break;
            case 5:
                say = "five";
                break;
            case 6:
                say = "six";
                break;
            case 7:
                say = "seven";
                break;
            case 8:
                say = "eight";
                break;
            case 9:
                say = "nine";
                break;
            case 10:
                say = "ten";
                break;
        }

        return say;
    }

    static String read11To19(int number) {
        String say = "";
        switch(number) {
            case 11:
                say = "eleven";
                break;
            case 12:
                say = "twelve";
                break;
            case 13:
                say = "thirteen";
                break;
            case 14:
                say = "forteen";
                break;
            case 15:
                say = "fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int unit = number % 10;
                say = read1To10(unit) + "teen";
                break;
        }

        return say;
    }

    static String readNumberTy(int number) {
        String say = "";

        switch (number) {
            case 20:
                say = "twenty";
                break;
            case 30:
                say = "thirty";
                break;
            case 40:
                say = "forty";
                break;
            case 50:
                say = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int dozen = number / 10;
                say = read1To10(dozen) + "ty";
                break;
        }
        return say;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển từ số sang chữ: ");
        int number = scanner.nextInt();


        int dozen = number / 10;
        String sayDozen = dozen + "0";
        int unit = number % 10;
        String result = readNumberTy(Integer.parseInt(sayDozen)) + " " + read1To10(unit);

        int hundred = number /100;

        // readOneHundred(int number) -> hangTram = number / 100
        // -> read1To10(hangTram) + "one hundred"
        // hangChucVaDonVi = number % 100;
        // read1To99(hangChucVaDonVi);

        System.out.println("Result: " + result);
    }
}

