package bai_tap.case_study.Data;

import bai_tap.case_study.Models.Person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteCustomer {

    public static final String CUSTOMER_CSV = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\bai_tap\\case_study\\Data\\customer.csv";

    public List<Customer> readCustomer() {
        List<Customer> customerList = new LinkedList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(CUSTOMER_CSV));
            String line;
            String[] arr;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String dayOfBirth = arr[2];
                String gender = arr[3];
                String identityCard = arr[4];
                String phoneNumber = arr[5];
                String email = arr[6];
                String typeOfGuest = arr[7];
                String address = arr[8];
                customer = new Customer(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, typeOfGuest, address);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public void writeCustomer(List<Customer> customers) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(CUSTOMER_CSV));
            for (Customer customer1 : customers) {
                bufferedWriter.write(customer1.getId() + "," + customer1.getName() + "," + customer1.getDayOfBirth() + "," +
                        customer1.getGender() + "," + customer1.getIdentityCard() + "," + customer1.getPhoneNumber() + "," +
                        customer1.getEmail() + "," + customer1.getTypeOfGuest() + "," + customer1.getAddress() + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeAppendCustomer(List<Customer> customers) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(CUSTOMER_CSV, true));
            for (Customer customer1 : customers) {
                bufferedWriter.write(customer1.getId() + "," + customer1.getName() + "," + customer1.getDayOfBirth() + "," +
                        customer1.getGender() + "," + customer1.getIdentityCard() + "," + customer1.getPhoneNumber() + "," +
                        customer1.getEmail() + "," + customer1.getTypeOfGuest() + "," + customer1.getAddress() + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
