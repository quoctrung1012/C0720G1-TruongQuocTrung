package lesson_11_dsa_stack_queue.exercise.bai_06_kiem_tra_dau_ngoac_trong_chuoi;

import java.util.Stack;

public class CheckBracket {

    public static Object checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            boolean isOpenBracket = str.charAt(i) == '(';
            boolean isCloseBracket = str.charAt(i) == ')';
            if (isOpenBracket) {
                stack.push('(');
            }
            if (isCloseBracket) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(checkBracket(string1));

        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        System.out.println(checkBracket(string2));

        String string3 = "s * (s – a) * (s – b * (s – c)";
        System.out.println(checkBracket(string3));

        String string4 = "s * (s – a) * s – b) * (s – c) ";
        System.out.println(checkBracket(string4));

        String string5 = "s * (s – a) * (s – b * (s – c)";
        System.out.println(checkBracket(string5));

        String string6 ="";
        System.out.println(checkBracket(string6));
    }
}
