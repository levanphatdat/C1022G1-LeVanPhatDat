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
    }

    @Override
    public void display() {
        List<Employee> employees = readWriteEmployee.readEmployee();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete(String id) {
        List<Employee> employees = readWriteEmployee.readEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.remove(employees.get(i));
            }
        }
        readWriteEmployee.writeEmployee(employees);
    }

    @Override
    public Employee checkID(String id) {
        List<Employee> employees = readWriteEmployee.readEmployee();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        List<Employee> employees = readWriteEmployee.readEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())) {
                employees.set(i, employee);
            }
        }
        readWriteEmployee.writeEmployee(employeeList);
    }
}
