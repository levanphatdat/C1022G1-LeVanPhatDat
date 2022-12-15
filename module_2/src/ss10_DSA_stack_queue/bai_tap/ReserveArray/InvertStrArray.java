package ss10_DSA_stack_queue.bai_tap.ReserveArray;

import java.util.Scanner;
import java.util.Stack;

public class InvertStrArray {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String mWord = scanner.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i) + "");
        }
        System.out.println(wStack);
        System.out.println("Enter new String: ");
        String newStr = scanner.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            newStr += wStack.pop();
        }
        System.out.println("Result is : ");
        System.out.println(newStr);
    }
}
