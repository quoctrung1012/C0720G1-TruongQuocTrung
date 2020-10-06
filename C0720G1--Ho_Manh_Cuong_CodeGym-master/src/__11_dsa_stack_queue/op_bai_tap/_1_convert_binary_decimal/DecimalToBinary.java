package __11_dsa_stack_queue.op_bai_tap._1_convert_binary_decimal;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 20;
        Stack<Integer> stack = new Stack<>();
        while (num != 0){
            stack.push(num % 2);
            num /= 2;
        }
        String str = "";
        while (!stack.isEmpty()){
            str += stack.pop();
        }
        System.out.println(str);
    }
}
