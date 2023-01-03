package bai_tap.case_study.Constrollers;

import java.io.IOException;
import java.util.Scanner;

public class BookingManagementController {
    public void bookingManagement()  {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Booking Management ----\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n" +
                    "-----------------------------\n" +
                    "Enter you choice : ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.err.println("Enter choice again ");
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
