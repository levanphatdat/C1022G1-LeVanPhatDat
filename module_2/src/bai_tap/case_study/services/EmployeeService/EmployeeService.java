package bai_tap.case_study.services.EmployeeService;

import bai_tap.case_study.models.Person.Employee;
import bai_tap.case_study.repository.Employee.IEmployeeRepository;
import bai_tap.case_study.repository.Employee.EmployeeRepository;

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
