package lesson_08_clean_code_and_refactoring.practice.bai02efactoring.FizzBuzzv2;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}
