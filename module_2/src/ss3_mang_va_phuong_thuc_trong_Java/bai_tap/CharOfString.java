package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Scanner;

public class CharOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scanner.nextLine();
        System.out.println("Enter the char:");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("The number of occurrences of a character in a string is " + count);
    }
}
