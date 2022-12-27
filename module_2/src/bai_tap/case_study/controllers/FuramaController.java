package bai_tap.case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----- Menu -----\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "-----------------------------\n" +
                    "Enter you choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeManagementController employeeManagementController = new EmployeeManagementController();
                    employeeManagementController.employeeManagement();
                    break;
                case 2:
                    CustomerManagementController customerManagementController=new CustomerManagementController();
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n" +
                            "Enter your choice : ");
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tReturn main menu\n" +
                            "Enter you choice : ");
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n" +
                            "Enter your choice : ");
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please choice again !!! ");
            }
        } while (true);
    }
}
