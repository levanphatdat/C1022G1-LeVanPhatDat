package bai_tap.case_study.Repository.EmployeeRepository;

import bai_tap.case_study.Models.Person.Employee;

public interface IEmployeeRepository {
    void add(Employee employee);

    void display();

    void delete(String id);

    Employee checkID(String id);

    void edit(Employee employee);
}
