package bai_tap.case_study.Repository.EmployeeRepository;

import bai_tap.case_study.Data.RAWEmployee;
import bai_tap.case_study.Models.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();
    static RAWEmployee readWriteEmployee=new RAWEmployee();

//    static {
//        employeeList.add(new Employee("NV-1", "Truong", "25/12/2022", "male", "191925684", "0923654123", "truong123@gmail.com", "After university", "Director", "50000000"));
//        employeeList.add(new Employee("NV-2", "Dat", "12/02/1999", "male", "191925341", "0936452145", "datcute@gmail.com", "university", "manager", "30000000"));
//        employeeList.add(new Employee("NV-3", "Khai", "05/07/2000", "male", "191936202", "0983242364", "khailor@gmail.com", "intermediate", "receptionist", "5000000"));
//    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        readWriteEmployee.writeEmployee(employeeList);
    }

    @Override
    public void display() {
        readWriteEmployee.readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void delete(String id) {
        List<Employee> employees=readWriteEmployee.readEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)){
                employees.remove(employees.get(i));
            }
        }
    }

    @Override
    public Employee checkID(String id) {
       List<Employee> employees= readWriteEmployee.readEmployee();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        List<Employee> employees=readWriteEmployee.readEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())) {
                employees.set(i, employee);
            }
        }
    }
}
