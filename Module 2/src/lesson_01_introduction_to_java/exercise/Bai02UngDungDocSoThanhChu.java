package lesson_01_introduction_to_java.exercise;

import java.util.Scanner;

public class Bai02UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền số cần đọc: ");
        int number = scanner.nextInt();
        if ((number <= 10) && (number > 0) ){
            String say;
            switch (number){
                case 1:
                    say = "One";
                    break;
                case 2:
                    say = "Two";
                    break;
                case 3:
                    say = "Three";
                    break;
                case 4:
                    say = "Four";
                    break;
                case 5:
                    say = "Five";
                    break;
                case 6:
                    say = "Six";
                    break;
                case 7:
                    say = "Seven";
                    break;
                case 8:
                    say = "Eight";
                    break;
                case 9:
                    say = "Nine";
                    break;
                case 10:
                    say = "Ten";
                    break;
        }


        }
    }
}
