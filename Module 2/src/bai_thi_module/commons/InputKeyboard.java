package bai_thi_module.commons;

import java.util.Scanner;

public class InputKeyboard {
    public static Scanner input = new Scanner(System.in);

    public static String inputCharacter() {
        return input.nextLine();
    }

    public static int inputNumberInteger() {
        while (true) {
            try {
                int number = Integer.parseInt(input.nextLine());
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Yêu cầu nhập đúng kiểu dữ liệu là số.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập đúng kiểu dữ liệu là số.");
            }
        }
    }

    public static void pressAnyKeyToContinue() {
        System.out.println("Press any key to continue");
        input.nextLine();
    }
}
