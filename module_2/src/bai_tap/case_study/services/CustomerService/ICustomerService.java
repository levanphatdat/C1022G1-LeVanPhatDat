package bai_tap.case_study.services.CustomerService;

import bai_tap.case_study.models.Person.Customer;

public interface ICustomerService {
    void display();
    void add(Customer customer);
    void edit(Customer customer);
    Customer checkID(String id);
}
