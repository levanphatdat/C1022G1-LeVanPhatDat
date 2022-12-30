package bai_tap.case_study.Services.CustomerService;

import bai_tap.case_study.Models.Person.Customer;
import bai_tap.case_study.Repository.CustomerRepository.CustomerRepository;
import bai_tap.case_study.Repository.CustomerRepository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository =new CustomerRepository();
    @Override
    public void display() {
        iCustomerRepository.display();
    }

    @Override
    public void add(Customer customer) {
        iCustomerRepository.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        iCustomerRepository.edit(customer);
    }

    @Override
    public Customer checkID(String id) {
        return iCustomerRepository.checkID(id);
    }
}
