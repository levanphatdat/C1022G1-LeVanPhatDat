package bai_tap.case_study.Repository.CustomerRepository;

import bai_tap.case_study.Data.ReadWriteCustomer;
import bai_tap.case_study.Models.Person.Customer;


import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static List<Customer> customerList = new LinkedList<>();
    ReadWriteCustomer readWriteCustomer = new ReadWriteCustomer();

    @Override
    public void display() {
        List<Customer> customers = readWriteCustomer.readCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        readWriteCustomer.writeAppendCustomer(customerList);
    }

    @Override
    public void edit(Customer customer) {
        List<Customer> customers = readWriteCustomer.readCustomer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customer.getId())) {
                customers.set(i, customer);
            }
        }
        readWriteCustomer.writeCustomer(customerList);
    }

    @Override
    public Customer checkID(String id) {
        List<Customer> customers = readWriteCustomer.readCustomer();
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
