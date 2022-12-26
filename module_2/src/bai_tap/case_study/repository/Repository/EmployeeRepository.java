package bai_tap.case_study.repository.Repository;

import bai_tap.case_study.models.Person.Employee;
import bai_tap.case_study.repository.IRepository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("NV-1", "Truong", "25/12/2022", true, "191925684", "0923654123", "truong123@gmail.com", "After university", "Director", "50.000.000"));
        employeeList.add(new Employee("NV-2", "Dat", "12/02/1999", true, "191925341", "0936452145", "datcute@gmail.com", "university", "manager", "30.000.000"));
        employeeList.add(new Employee("NV-3", "Khai", "05/07/2000", true, "191936202", "0983242364", "khailor@gmail.com", "intermediate", "receptionist", "5.000.000"));
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employeeList.remove(employee);
            }
        }
    }

    @Override
    public Employee checkID(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
            }
        }
    }
}
