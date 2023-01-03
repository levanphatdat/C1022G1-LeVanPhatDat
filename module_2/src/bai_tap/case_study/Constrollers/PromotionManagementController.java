package bai_tap.case_study.Constrollers;

import java.util.Scanner;

public class PromotionManagementController {
    public void promotionManagement() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Promotion Management ----\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n" +
                    "------------------------------\n" +
                    "Enter your choice : ");
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
