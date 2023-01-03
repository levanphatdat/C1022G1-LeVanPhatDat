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
            int choice = -2;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter the number again");
            }
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
                        do {
                            System.out.println("Enter the gender : \n" +
                                    "1. Male\n" +
                                    "2. Female\n" +
                                    "3. Other Gender\n" +
                                    "Enter you choice : ");
                            int choiceG = -1;
                            try {
                                choiceG = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.err.println("Enter choice again ");
                            }
                            switch (choiceG) {
                                case 1:
                                    addGender = "Male";
                                    break;
                                case 2:
                                    addGender = "Female";
                                    break;
                                case 3:
                                    addGender = "Other Gender";
                                    break;
                            }
                        } while (!RegexCode.checkGender(addGender));

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
                        do {
                            System.out.println("Enter the qualification :\n" +
                                    "1. Intermediate\n" +
                                    "2. College\n" +
                                    "3. University\n" +
                                    "4. After University\n" +
                                    "Enter your choice : ");
                            int choiceQ = -1;
                            try {
                                choiceQ = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.err.println("Enter choice again ");
                            }
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
                            }
                        } while (!RegexCode.checkQualification(addQualification));

                        String addPosition = "";
                        do {
                            System.out.println("Enter the position : \n" +
                                    "1. Receptionist\n" +
                                    "2. Staff\n" +
                                    "3. Specialist \n" +
                                    "4. Supervisory \n" +
                                    "5. Manager\n" +
                                    "6. President\n" +
                                    "Enter your choice : ");
                            int choiceP = -1;
                            try {
                                choiceP = Integer.parseInt(scanner.nextLine());

                            } catch (NumberFormatException e) {
                                System.err.println("Enter choice again ");
                            }
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
                            }
                        } while (!RegexCode.checkPosition(addPosition));

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
                    String editID;
                    do {
                        System.out.println("Enter the service code : ");
                        editID = scanner.nextLine();
                    } while (!RegexCode.checkEmployeeID(editID));
                    Employee employee2 = iEmployeeService.checkID(editID);
                    if (employee2 != null) {
                        String editName;
                        String editBirth;
                        String editGender = "";
                        String editEmail;
                        String editPhone;
                        String editIdentity;
                        String editQualification = "";
                        String editPosition = "";
                        String editSalary;
                            System.out.println("Select the item you want to edit :\n" +
                                    "1. Name\n" +
                                    "2. Day of birth\n" +
                                    "3. Gender\n" +
                                    "4. Identity code\n" +
                                    "5. Phone number\n" +
                                    "6. Email\n" +
                                    "7. Qualification\n" +
                                    "8. Position\n" +
                                    "9. Salary\n" +
                                    "10. Return menu\n" +
                                    "------------------------------");
                            int choice1 = -1;
                            try {
                                choice1 = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                System.err.println("Enter the number again");
                            }
                            switch (choice1) {
                                case 1:
                                    do {
                                        System.out.println("Enter the name : ");
                                        editName = scanner.nextLine();
                                    } while (!RegexCode.checkName(editName));
                                    employee2.setName(editName);
                                    break;
                                case 2:
                                    do {
                                        System.out.println("Enter the day of birth : ");
                                        editBirth = scanner.nextLine();
                                    } while (!RegexCode.checkDateOfBirth(editBirth));
                                    employee2.setDayOfBirth(editBirth);
                                    break;
                                case 3:
                                    do {
                                        System.out.println("Enter the gender : \n" +
                                                "1. Male\n" +
                                                "2. Female\n" +
                                                "3. Other Gender\n" +
                                                "Enter you choice : ");
                                        int choiceG = -1;
                                        try {
                                            choiceG = Integer.parseInt(scanner.nextLine());

                                        } catch (NumberFormatException e) {
                                            System.err.println("Enter choice again ");
                                        }
                                        switch (choiceG) {
                                            case 1:
                                                editGender = "Male";
                                                break;
                                            case 2:
                                                editGender = "Female";
                                                break;
                                            case 3:
                                                editGender = "Other Gender";
                                                break;
                                        }
                                    } while (!RegexCode.checkGender(editGender));
                                    employee2.setGender(editGender);
                                    break;
                                case 4:
                                    do {
                                        System.out.println("Enter the identity code : ");
                                        editIdentity = scanner.nextLine();
                                    } while (!RegexCode.checkIdentityCode(editIdentity));
                                    employee2.setIdentityCard(editIdentity);
                                    break;
                                case 5:
                                    do {
                                        System.out.println("Enter the phone number : ");
                                        editPhone = scanner.nextLine();
                                    } while (!RegexCode.checkPhoneNumber(editPhone));
                                    employee2.setPhoneNumber(editPhone);
                                    break;
                                case 6:

                                    do {
                                        System.out.println("Enter the email : ");
                                        editEmail = scanner.nextLine();
                                    } while (!RegexCode.checkEmail(editEmail));
                                    employee2.setEmail(editEmail);
                                    break;
                                case 7:
                                    do {
                                        System.out.println("Enter the qualification :\n" +
                                                "1. Intermediate\n" +
                                                "2. College\n" +
                                                "3. University\n" +
                                                "4. After University\n" +
                                                "Enter your choice : ");
                                        int choiceQ = -1;
                                        try {
                                            choiceQ = Integer.parseInt(scanner.nextLine());

                                        } catch (NumberFormatException e) {
                                            System.err.println("Enter choice again ");
                                        }
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
                                        }
                                    } while (!RegexCode.checkQualification(editQualification));
                                    employee2.setQualifications(editQualification);
                                    break;
                                case 8:
                                    do {
                                        System.out.println("Enter the position : \n" +
                                                "1. Receptionist\n" +
                                                "2. Staff\n" +
                                                "3. Specialist \n" +
                                                "4. Supervisory \n" +
                                                "5. Manager\n" +
                                                "6. President\n" +
                                                "Enter your choice : ");
                                        int choiceP = -1;
                                        try {
                                            choiceP = Integer.parseInt(scanner.nextLine());

                                        } catch (NumberFormatException e) {
                                            System.err.println("Enter choice again ");
                                        }
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
                                        }
                                    } while (!RegexCode.checkPosition(editPosition));
                                    employee2.setPosition(editPosition);
                                    break;
                                case 9:
                                    do {
                                        System.out.println("Enter the salary : ");
                                        editSalary = scanner.nextLine();
                                    } while (!RegexCode.checkRentalCost(editSalary));
                                    employee2.setSalary(editSalary);
                                    break;
                                case 10:
                                    return ;
                                default:
                                    System.out.println("Enter choice again");
                            }
                            System.out.println("Edit complete");
                            iEmployeeService.edit(employee2);
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("You choose wrong. Please choose again");
            }
        } while (true);
    }
}
