package bai_tap.case_study.services.IService;

import bai_tap.case_study.models.Person.Employee;

public interface IEmployeeService {
    void add(Employee employee);

    void display();

    void delete(String id);

    Employee checkID(String id);

    void edit(Employee employee);
}
