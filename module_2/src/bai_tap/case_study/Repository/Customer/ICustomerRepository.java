package bai_tap.case_study.Repository.Customer;

import bai_tap.case_study.Models.Person.Customer;

public interface ICustomerRepository {
    void display();
    void add(Customer customer);
    void edit(Customer customer);
    Customer checkID(String id);
}
