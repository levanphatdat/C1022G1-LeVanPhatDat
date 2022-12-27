package bai_tap.case_study.repository.Customer;

import bai_tap.case_study.models.Person.Customer;

public interface ICustomerRepository {
    void display();
    void add(Customer customer);
    void edit(Customer customer);
    Customer checkID(String id);
}
