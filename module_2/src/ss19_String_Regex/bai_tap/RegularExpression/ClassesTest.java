package ss19_String_Regex.bai_tap.RegularExpression;

import java.util.Scanner;

public class ClassesTest {
    private static final String CLASSES = "^[CAP][\\d]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name class : ");
        String string = scanner.nextLine();
        System.out.println("Class is " + string + " is valid " + string.matches(CLASSES));
    }
}
