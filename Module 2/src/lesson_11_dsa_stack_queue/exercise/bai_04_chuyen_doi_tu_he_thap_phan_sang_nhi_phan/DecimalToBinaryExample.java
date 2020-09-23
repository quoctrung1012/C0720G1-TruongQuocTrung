package lesson_11_dsa_stack_queue.exercise.bai_04_chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class DecimalToBinaryExample {
    public void convertBinary(int number){
        Stack<Integer> stack = new Stack<Integer>();
        while (number !=0){
            int div = number %2;
            stack.push(div);
            number = number /2;
        }
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.println("Hệ nhị phân của: " + decimalNumber + " là");
        new DecimalToBinaryExample().convertBinary(decimalNumber);
    }
}
