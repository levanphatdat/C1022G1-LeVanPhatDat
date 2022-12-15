package ss10_DSA_stack_queue.bai_tap.DecimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }
        System.out.println(" Binary is : ");
        while (!stack.isEmpty()) {
            System.out.printf("%d  ", stack.pop());
        }
    }
}
