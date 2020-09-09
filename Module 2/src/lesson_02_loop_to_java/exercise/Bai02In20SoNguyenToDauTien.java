package lesson_02_loop_to_java.exercise;

public class Bai02In20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên là:");

        while (count < 20) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
