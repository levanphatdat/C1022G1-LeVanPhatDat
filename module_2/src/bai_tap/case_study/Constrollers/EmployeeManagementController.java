package bai_tap.case_study.Constrollers;

import bai_tap.case_study.Models.Person.Employee;
import bai_tap.case_study.Services.EmployeeService.IEmployeeService;
import bai_tap.case_study.Services.EmployeeService.EmployeeService;
import bai_tap.case_study.Ultis.RegexCode;

import java.util.Scanner;

public class EmployeeManagementController {
    public void employeeManagement() {
        IEmployeeService iEmployeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------ Employee Management ------\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n" +
                    "-----------------------------\n" +
                    "Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    String addID;
                    do {
                        System.out.println("Enter the id : ");
                        addID = scanner.nextLine();
                    } while (!RegexCode.checkEmployeeID(addID));
                    Employee employee3 = iEmployeeService.checkID(addID);
                    if (employee3 == null) {
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

                        String addQualification = "";
                        System.out.println("Enter the qualification :\n" +
                                "1. Intermediate\n" +
                                "2. College\n" +
                                "3. University\n" +
                                "4. After University\n" +
                                "Enter your choice : ");
                        int choiceQ = Integer.parseInt(scanner.nextLine());
                        switch (choiceQ) {
                            case 1:
                                addQualification = "Intermediate";
                                break;
                            case 2:
                                addQualification = "College";
                                break;
                            case 3:
                                addQualification = "University";
                                break;
                            case 4:
                                addQualification = "After University";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String addPosition = "";
                        System.out.println("Enter the position : \n" +
                                "1. Receptionist\n" +
                                "2. Staff\n" +
                                "3. Specialist \n" +
                                "4. Supervisory \n" +
                                "5. Manager\n" +
                                "6. President\n" +
                                "Enter your choice : ");
                        int choiceP = Integer.parseInt(scanner.nextLine());
                        switch (choiceP) {
                            case 1:
                                addPosition = "Receptionist";
                                break;
                            case 2:
                                addPosition = "Staff";
                                break;
                            case 3:
                                addPosition = "Specialist";
                                break;
                            case 4:
                                addPosition = "Supervisory";
                                break;
                            case 5:
                                addPosition = "Manager";
                                break;
                            case 6:
                                addPosition = "President";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String addSalary = "";
                        do {
                            System.out.println("Enter the salary : ");
                            addSalary = scanner.nextLine();
                        } while (!RegexCode.checkRentalCost(addSalary));

                        Employee employee = new Employee(addID, addName, addBirth, addGender, addIdentity, addPhone, addEmail, addQualification, addPosition, addSalary);
                        iEmployeeService.add(employee);
                    } else {
                        System.out.println("ID is duplicated !!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the id your want delete : ");
                    String delID = scanner.nextLine();
                    Employee employee1 = iEmployeeService.checkID(delID);
                    if (employee1 != null) {
                        iEmployeeService.delete(delID);
                        System.out.println("Delete complete.");
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 4:
                    //addID, addName, addBirth, addGender, addIdentity, addPhone, addEmail, addQualification, addPosition, addSalary
                    System.out.println("Enter the id your want edit : ");
                    String editID = scanner.nextLine();
                    Employee employee2 = iEmployeeService.checkID(editID);
                    if (employee2 != null) {
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

                        String editQualification = "";
                        System.out.println("Enter the qualification :\n" +
                                "1. Intermediate\n" +
                                "2. College\n" +
                                "3. University\n" +
                                "4. After University\n" +
                                "Enter your choice : ");
                        int choiceQ = Integer.parseInt(scanner.nextLine());
                        switch (choiceQ) {
                            case 1:
                                editQualification = "Intermediate";
                                break;
                            case 2:
                                editQualification = "College";
                                break;
                            case 3:
                                editQualification = "University";
                                break;
                            case 4:
                                editQualification = "After University";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String editPosition = "";
                        System.out.println("Enter the position : \n" +
                                "1. Receptionist\n" +
                                "2. Staff\n" +
                                "3. Specialist \n" +
                                "4. Supervisory \n" +
                                "5. Manager\n" +
                                "6. President\n" +
                                "Enter your choice : ");
                        int choiceP = Integer.parseInt(scanner.nextLine());
                        switch (choiceP) {
                            case 1:
                                editPosition = "Receptionist";
                                break;
                            case 2:
                                editPosition = "Staff";
                                break;
                            case 3:
                                editPosition = "Specialist";
                                break;
                            case 4:
                                editPosition = "Supervisory";
                                break;
                            case 5:
                                editPosition = "Manager";
                                break;
                            case 6:
                                editPosition = "President";
                                break;
                            default:
                                System.out.println("Please choice again.");
                        }

                        String editSalary;
                        do {
                            System.out.println("Enter the salary : ");
                            editSalary = scanner.nextLine();
                        } while (!RegexCode.checkRentalCost(editSalary));
                        employee2.setName(editName);
                        employee2.setDayOfBirth(editBirth);
                        employee2.setGender(editGender);
                        employee2.setIdentityCard(editIdentity);
                        employee2.setPhoneNumber(editPhone);
                        employee2.setEmail(editEmail);
                        employee2.setQualifications(editQualification);
                        employee2.setPosition(editPosition);
                        employee2.setSalary(editSalary);
                        iEmployeeService.edit(employee2);
                        System.out.println("Edit complete.");
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
