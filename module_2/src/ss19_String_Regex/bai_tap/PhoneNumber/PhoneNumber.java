package ss19_String_Regex.bai_tap.PhoneNumber;

import java.util.Scanner;

public class PhoneNumber {
    private static final String PHONE = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";
    private static final String REGEX_ROOM="^SVRO-\\d{4}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number : ");
        String string = scanner.nextLine();
        System.out.println("Phone number is " + string + " is valid " + string.matches(REGEX_ROOM));
    }
}

