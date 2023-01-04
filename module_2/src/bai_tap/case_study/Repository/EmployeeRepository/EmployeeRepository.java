package bai_tap.case_study.Repository.EmployeeRepository;

import bai_tap.case_study.Data.ReadWriteEmployee;
import bai_tap.case_study.Models.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();
    public static ReadWriteEmployee readWriteEmployee = new ReadWriteEmployee();

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        readWriteEmployee.writeAppendEmployee(employeeList);
        employeeList.clear();
    }

    @Override
    public void display() {
        employeeList = readWriteEmployee.readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete(String id) {
        employeeList = readWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }

    @Override
    public Employee checkID(String id) {
         employeeList = readWriteEmployee.readEmployee();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
         employeeList = readWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
            }
        }
    }
}
