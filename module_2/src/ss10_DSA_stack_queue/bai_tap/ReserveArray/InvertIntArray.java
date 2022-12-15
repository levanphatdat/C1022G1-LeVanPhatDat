package ss10_DSA_stack_queue.bai_tap.ReserveArray;

import java.util.Scanner;
import java.util.Stack;

public class InvertIntArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Index of " + i);
            stack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Array before is: ");
        System.out.println(stack);
        System.out.println("Array after is :");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", stack.pop());
        }
    }
}
