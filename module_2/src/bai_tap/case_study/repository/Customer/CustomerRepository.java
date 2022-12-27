package bai_tap.case_study.repository.Customer;

import bai_tap.case_study.models.Person.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    public static List<Customer> customerList= new LinkedList<>();
    static {
        customerList.add(new Customer("KH-1","Mr.Dat","27/09/1999",true,"191612354","0985123547","dathhi@gmail.com","Diamond","Hue"));
        customerList.add(new Customer("KH-2","Mrs.Hi","01/12/1999",false,"191958263","0981125485","cobengoknnghek@gmail.com","Member","Hue"));
        customerList.add(new Customer("KH-3","Mr.Minh","15/06/1985",true,"191256484","0981255552","chubedan@gmail.com","Gold","Da Nang"));
    }

    @Override
    public void display() {
        for (Customer customer:customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customer.getId().equals(customerList.get(i).getId())){
                customerList.set(i,customer);
            }
        }
    }

    @Override
    public Customer checkID(String id) {
        for (Customer customer: customerList){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
}
