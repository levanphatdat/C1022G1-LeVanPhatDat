package bai_tap.case_study.Services.CustomerService;

import bai_tap.case_study.Models.Person.Customer;

public interface ICustomerService {
    void display();
    void add(Customer customer);
    void edit(Customer customer);
    Customer checkID(String id);
}
