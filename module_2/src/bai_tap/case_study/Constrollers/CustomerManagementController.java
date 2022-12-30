package bai_tap.case_study.Constrollers;

import bai_tap.case_study.Models.Person.Customer;
import bai_tap.case_study.Services.CustomerService.CustomerService;
import bai_tap.case_study.Services.CustomerService.ICustomerService;
import bai_tap.case_study.Ultis.RegexCode;

import java.util.Scanner;

public class CustomerManagementController {
    public void customerManagement() {
        ICustomerService iCustomerService = new CustomerService();
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
                    String addID;
                    do {
                        System.out.println("Enter the id : ");
                        addID = scanner.nextLine();
                    } while (!RegexCode.checkCustomerID(addID));
                    Customer customer0 = iCustomerService.checkID(addID);
                    if (customer0 == null) {
                        String addName;
                        do {
                            System.out.println("Enter the name : ");
                            addName = scanner.nextLine();
                        } while (!RegexCode.checkName(addName));

                        String addBirth;
                        do {
                            System.out.println("Enter the day of birth : ");
                            addBirth = scanner.nextLine();
                        } while (!RegexCode.checkDateOfBirth(addBirth));

                        String addGender = "";
                        System.out.println("Enter the gender : \n" +
                                "1. Male\n" +
                                "2. Female\n" +
                                "Enter you choice : ");
                        int choiceG = Integer.parseInt(scanner.nextLine());
                        switch (choiceG) {
                            case 1:
                                addGender = "Male";
                                break;
                            case 2:
                                addGender = "Female";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String addIdentity;
                        do {
                            System.out.println("Enter the identity code : ");
                            addIdentity = scanner.nextLine();
                        } while (!RegexCode.checkIdentityCode(addIdentity));

                        String addPhone;
                        do {
                            System.out.println("Enter the phone number : ");
                            addPhone = scanner.nextLine();
                        } while (!RegexCode.checkPhoneNumber(addPhone));

                        String addEmail;
                        do {
                            System.out.println("Enter the email : ");
                            addEmail = scanner.nextLine();
                        } while (!RegexCode.checkEmail(addEmail));

                        String addTypeOfGuest = "";
                        System.out.println("Enter the type of guest : \n" +
                                "1. Diamond\n" +
                                "2. Platinum\n" +
                                "3. Gold\n" +
                                "4. Silver\n" +
                                "5. Member\n" +
                                "Enter your choice : ");
                        int choiceTypeOfGuest = Integer.parseInt(scanner.nextLine());
                        switch (choiceTypeOfGuest) {
                            case 1:
                                addTypeOfGuest = "Diamond";
                                break;
                            case 2:
                                addTypeOfGuest = "Platinum";
                                break;
                            case 3:
                                addTypeOfGuest = "Gold";
                                break;
                            case 4:
                                addTypeOfGuest = "Silver";
                                break;
                            case 5:
                                addTypeOfGuest = "Member";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        System.out.println("Enter the address : ");
                        String addAddress = scanner.nextLine();
                        Customer customer = new Customer(addID, addName, addBirth, addGender, addIdentity, addPhone, addEmail, addTypeOfGuest, addAddress);
                        iCustomerService.add(customer);
                        System.out.println("Add new customer complete.");
                    } else {
                        System.out.println("ID is duplicated !!!");
                    }
                    break;
                case 3:
                    String editID;
                    do {
                        System.out.println("Enter the id your want edit : ");
                        editID = scanner.nextLine();
                    } while (!RegexCode.checkCustomerID(editID));

                    Customer customer1 = iCustomerService.checkID(editID);
                    if (customer1 != null) {
                        String editName;
                        do {
                            System.out.println("Enter the name : ");
                            editName = scanner.nextLine();
                        } while (!RegexCode.checkName(editName));

                        String editBirth;
                        do {
                            System.out.println("Enter the day of birth : ");
                            editBirth = scanner.nextLine();
                        } while (!RegexCode.checkDateOfBirth(editBirth));

                        String editGender = "";
                        System.out.println("Enter the gender : \n" +
                                "1. Male\n" +
                                "2. Female\n" +
                                "Enter you choice : ");
                        int choiceG = Integer.parseInt(scanner.nextLine());
                        switch (choiceG) {
                            case 1:
                                editGender = "Male";
                                break;
                            case 2:
                                editGender = "Female";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String editIdentity;
                        do {
                            System.out.println("Enter the identity code : ");
                            editIdentity = scanner.nextLine();
                        } while (!RegexCode.checkIdentityCode(editIdentity));

                        String editPhone;
                        do {
                            System.out.println("Enter the phone number : ");
                            editPhone = scanner.nextLine();
                        } while (!RegexCode.checkPhoneNumber(editPhone));

                        String editEmail;
                        do {
                            System.out.println("Enter the email : ");
                            editEmail = scanner.nextLine();
                        } while (!RegexCode.checkEmail(editEmail));

                        String editTypeOfGuest = "";
                        System.out.println("Enter the type of guest : \n" +
                                "1. Diamond\n" +
                                "2. Platinum\n" +
                                "3. Gold\n" +
                                "4. Silver\n" +
                                "5. Member\n" +
                                "Enter your choice : ");
                        int choiceTypeOfGuest = Integer.parseInt(scanner.nextLine());
                        switch (choiceTypeOfGuest) {
                            case 1:
                                editTypeOfGuest = "Diamond";
                                break;
                            case 2:
                                editTypeOfGuest = "Platinum";
                                break;
                            case 3:
                                editTypeOfGuest = "Gold";
                                break;
                            case 4:
                                editTypeOfGuest = "Silver";
                                break;
                            case 5:
                                editTypeOfGuest = "Member";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

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
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
