package bai_tap.case_study.controllers;

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
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
