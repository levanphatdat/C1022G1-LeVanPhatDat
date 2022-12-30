package bai_tap.case_study.Data;

import bai_tap.case_study.Models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RAWEmployee {

    public static final String EMPLOYEE_CSV = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\bai_tap\\case_study\\Data\\employee.csv";

    public List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(EMPLOYEE_CSV));
        } catch (FileNotFoundException e) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }
        String[] strings;
        String line;
        Employee employee;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split(",");
                String id = strings[0];
                String name = strings[1];
                String dayOfBirth = strings[2];
                String gender = strings[3];
                String identityCard = strings[4];
                String phoneNumber = strings[5];
                String email = strings[6];
                String qualifications = strings[7];
                String position = strings[8];
                String salary = strings[9];
                employee = new Employee(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, qualifications, position, salary);
                employeeList.add(employee);
            }
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

    public void writeEmployee(List<Employee> employeeList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(EMPLOYEE_CSV, true));
            for (Employee employee : employeeList) {
                try {
                    bufferedWriter.write(employee + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
