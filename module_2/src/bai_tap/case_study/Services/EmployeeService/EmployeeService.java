package bai_tap.case_study.Services.EmployeeService;

import bai_tap.case_study.Models.Person.Employee;
import bai_tap.case_study.Repository.EmployeeRepository.IEmployeeRepository;
import bai_tap.case_study.Repository.EmployeeRepository.EmployeeRepository;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.add(employee);
    }

    @Override
    public void display() {
        iEmployeeRepository.display();
    }

    @Override
    public void delete(String id) {
        iEmployeeRepository.delete(id);
    }

    @Override
    public Employee checkID(String id) {
        return iEmployeeRepository.checkID(id);
    }

    @Override
    public void edit(Employee employee) {
        iEmployeeRepository.edit(employee);
    }
}
