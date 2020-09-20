package lesson_08_clean_code_and_refactoring.practice.bai02efactoring.FizzBuzzv1;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        if (number % 3 == 0)
            return "Fizz";

        if (number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
