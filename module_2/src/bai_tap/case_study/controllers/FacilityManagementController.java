package bai_tap.case_study.controllers;


import bai_tap.case_study.services.FacilityService.FacilityService;
import bai_tap.case_study.services.FacilityService.IFacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    public void facilityManagement() {
        IFacilityService iFacilityService = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---- Facility Management ----\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n" +
                    "-----------------------------\n" +
                    "Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
