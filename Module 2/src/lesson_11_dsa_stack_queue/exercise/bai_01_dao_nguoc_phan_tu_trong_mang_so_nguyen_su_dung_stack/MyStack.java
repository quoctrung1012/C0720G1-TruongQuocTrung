package lesson_11_dsa_stack_queue.exercise.bai_01_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class MyStack {
    private static void stackOfIntegers() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.printf("Stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
    }

    private static void stackOfString() {
        String mWork = "how do you do in?";
        Stack<Character> listStack = new Stack<>();
        for (Character i = 0; i < mWork.length(); i++) {
            listStack.push(mWork.charAt(i));
        }
        for (int i = 0; i < mWork.length(); i++) {
            System.out.print(listStack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack of integers");
        stackOfIntegers();
        System.out.println();
        System.out.println("Stack of String");
        stackOfString();
    }
}
