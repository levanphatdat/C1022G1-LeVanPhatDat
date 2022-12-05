package ss2_vong_lap_trong_Java.bai_tap;

import java.util.Scanner;

public class GeometricTypes {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 7; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 7; k > i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 10; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
