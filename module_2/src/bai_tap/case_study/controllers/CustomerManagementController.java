package bai_tap.case_study.controllers;

import bai_tap.case_study.models.Person.Customer;
import bai_tap.case_study.models.Person.Employee;
import bai_tap.case_study.services.CustomerService.CustomerServiceImpl;
import bai_tap.case_study.services.CustomerService.ICustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    public void customerManagement() {
        FuramaController furamaController = new FuramaController();
        ICustomerService iCustomerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----- Customer Management -----\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n" +
                    "--------------------------------\n" +
                    "Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    System.out.println("Enter the id : ");
                    String addID = scanner.nextLine();
                    System.out.println("Enter the name : ");
                    String addName = scanner.nextLine();
                    System.out.println("Enter the day of birth : ");
                    String addBirth = scanner.nextLine();
                    System.out.println("Enter the gender : ");
                    boolean addGender = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter the identity code : ");
                    String addIdentity = scanner.nextLine();
                    System.out.println("Enter the phone number : ");
                    String addPhone = scanner.nextLine();
                    System.out.println("Enter the email : ");
                    String addEmail = scanner.nextLine();
                    System.out.println("Enter the type of guest : ");
                    String addTypeOfGuest = scanner.nextLine();
                    System.out.println("Enter the address : ");
                    String addAddress = scanner.nextLine();
                    Customer customer = new Customer(addID, addName, addBirth, addGender, addIdentity, addPhone, addEmail, addTypeOfGuest, addAddress);
                    iCustomerService.add(customer);
                    System.out.println("Add new customer complete.");
                    break;
                case 3:
                    System.out.println("Enter the id your want edit : ");
                    String editID = scanner.nextLine();
                    Customer customer1 = iCustomerService.checkID(editID);
                    if (customer1 != null) {
                        System.out.println("Enter the name : ");
                        String editName = scanner.nextLine();
                        System.out.println("Enter the day of birth : ");
                        String editBirth = scanner.nextLine();
                        System.out.println("Enter the gender : ");
                        boolean editGender = Boolean.parseBoolean(scanner.nextLine());
                        System.out.println("Enter the identity code : ");
                        String editIdentity = scanner.nextLine();
                        System.out.println("Enter the phone number : ");
                        String editPhone = scanner.nextLine();
                        System.out.println("Enter the email : ");
                        String editEmail = scanner.nextLine();
                        System.out.println("Enter the type of guest : ");
                        String editTypeOfGuest = scanner.nextLine();
                        System.out.println("Enter the address : ");
                        String editAddress = scanner.nextLine();
                        customer1.setName(editName);
                        customer1.setDayOfBirth(editBirth);
                        customer1.setGender(editGender);
                        customer1.setIdentityCard(editIdentity);
                        customer1.setPhoneNumber(editPhone);
                        customer1.setEmail(editEmail);
                        customer1.setTypeOfGuest(editTypeOfGuest);
                        customer1.setAddress(editAddress);
                        iCustomerService.edit(customer1);
                        System.out.println("Edit complete.");
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 4:
                    furamaController.displayMainMenu();
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
