package lesson_08_clean_code_and_refactoring.practice.bai02efactoring.FizzBuzzv2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizz3() {
        int isFizz = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(isFizz);
        assertEquals(expected, result);
    }

    @Test
    public void testFizz6() {
        int isFizz = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(isFizz);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz5() {
        int isBuzz = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(isBuzz);
        assertEquals(expected, result);
    }

    @Test
    public void testBuzz10() {
        int isBuzz = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(isBuzz);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz15() {
        int isBuzz = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(isBuzz);
        assertEquals(expected, result);
    }

    @Test
    public void testFizzBuzz30() {
        int isFizzBuzz = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(isFizzBuzz);
        assertEquals(expected, result);
    }
}
