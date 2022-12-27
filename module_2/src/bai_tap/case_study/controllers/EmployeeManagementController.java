package bai_tap.case_study.controllers;

import bai_tap.case_study.models.Person.Employee;
import bai_tap.case_study.services.EmployeeService.IEmployeeService;
import bai_tap.case_study.services.EmployeeService.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagementController {
    public void employeeManagement() {
        FuramaController furamaController = new FuramaController();
        IEmployeeService iEmployeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------ Employee Management ------\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n" +
                    "Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iEmployeeService.display();
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
                    System.out.println("Enter the qualification : ");
                    String addQualification = scanner.nextLine();
                    System.out.println("Enter the position : ");
                    String addPosition = scanner.nextLine();
                    System.out.println("Enter the salary : ");
                    String addSalary = scanner.nextLine();
                    Employee employee = new Employee(addID, addName, addBirth, addGender, addIdentity, addPhone, addEmail, addQualification, addPosition, addSalary);
                    iEmployeeService.add(employee);
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
                        System.out.println("Enter the qualification : ");
                        String editQualification = scanner.nextLine();
                        System.out.println("Enter the position : ");
                        String editPosition = scanner.nextLine();
                        System.out.println("Enter the salary : ");
                        String editSalary = scanner.nextLine();
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
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
