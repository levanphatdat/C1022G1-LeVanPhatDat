package ss10_DSA_stack_queue.bai_tap.Palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
            queue.offer(str.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (!stack.pop().equals(queue.poll())) {
                System.out.println("String is not a Palindrome !!!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is a Palindrome.");
        }
    }
}
