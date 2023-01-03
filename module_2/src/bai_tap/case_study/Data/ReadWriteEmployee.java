package bai_tap.case_study.Data;

import bai_tap.case_study.Models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {

    public static final String EMPLOYEE_CSV = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\bai_tap\\case_study\\Data\\employee.csv";

    public List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(EMPLOYEE_CSV));
            String line;
            String[] arr;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String dayOfBirth = arr[2];
                String gender = arr[3];
                String identityCard = arr[4];
                String phoneNumber = arr[5];
                String email = arr[6];
                String qualifications = arr[7];
                String position = arr[8];
                String salary = arr[9];
                employee = new Employee(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, qualifications, position, salary);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    public void writeEmployee(List<Employee> employee) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(EMPLOYEE_CSV));
            for (Employee employee1 : employee) {
                bufferedWriter.write(employee1.getId() + "," + employee1.getName() + "," + employee1.getDayOfBirth() + "," + employee1.getGender()
                        + "," + employee1.getIdentityCard() + "," + employee1.getPhoneNumber() + "," + employee1.getEmail() + "," + employee1.getQualifications()
                        + "," + employee1.getPosition() + "," + employee1.getSalary() + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void writeAppendEmployee(List<Employee> employee) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(EMPLOYEE_CSV, true));
            for (Employee employee1 : employee) {
                bufferedWriter.write(employee1.getId() + "," + employee1.getName() + "," + employee1.getDayOfBirth() + "," + employee1.getGender()
                        + "," + employee1.getIdentityCard() + "," + employee1.getPhoneNumber() + "," + employee1.getEmail() + "," + employee1.getQualifications()
                        + "," + employee1.getPosition() + "," + employee1.getSalary() + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
