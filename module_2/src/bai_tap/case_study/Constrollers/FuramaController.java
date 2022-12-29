package bai_tap.case_study.Constrollers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
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
                    CustomerManagementController customerManagementController = new CustomerManagementController();
                    customerManagementController.customerManagement();
                    break;
                case 3:
                    FacilityManagementController facilityManagementController = new FacilityManagementController();
                    facilityManagementController.facilityManagement();
                    break;
                case 4:
                    BookingManagementController bookingManagementController = new BookingManagementController();
                    bookingManagementController.bookingManagement();
                    break;
                case 5:
                    PromotionManagementController promotionManagementController = new PromotionManagementController();
                    promotionManagementController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please choice again !!! ");
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
