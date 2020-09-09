package lesson_02_loop_to_java.exercise;

public class Bai03InSoNguyenToNhoHon100 {
    public static void main(String[] args) {

        for (int number = 2; number < 100; number++) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(number);
            }
        }
    }
}
