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
        customerList = readWriteCustomer.readCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
        readWriteCustomer.writeAppendCustomer(customerList);
        customerList.clear();
    }

    @Override
    public void edit(Customer customer) {
        customerList = readWriteCustomer.readCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
            }
        }
    }

    @Override
    public Customer checkID(String id) {
        customerList = readWriteCustomer.readCustomer();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
