package lesson_02_loop_to_java.exercise;

import java.util.Scanner;

public class Bai01InHinh {
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left ");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while (true){
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("In hình chữ nhật:");
                    for (int i = 1; i <= 4;i++){
                        for (int j = 1; j <= 7 ;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                    for(int i=1; i<=7; i++){
                        for(int j=1; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
