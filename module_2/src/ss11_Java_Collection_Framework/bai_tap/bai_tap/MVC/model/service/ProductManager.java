package ss11_Java_Collection_Framework.bai_tap.bai_tap.MVC.model.service;

import ss11_Java_Collection_Framework.bai_tap.bai_tap.MVC.model.model.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProductManager {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new LinkedList<>();

    static {
        products.add(new Product(1, "bike", 5));
        products.add(new Product(2, "Motorbike", 55));
        products.add(new Product(3, "Car", 555));
    }

    @Override
    public void add() {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        int productID = product.getId();
        if (check(productID)) {
            System.out.println("Your id is duplicated !!!");
            System.out.println("Rewrite your ID");
        } else {
            products.add(product);
            System.out.println("Add successful products.");
        }
    }

    public boolean check(int checkID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == (checkID)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update() {
        System.out.println("Enter the ID you want to update :");
        int updateID = Integer.parseInt(scanner.nextLine());
        if (checkID(updateID) != null) {
            System.out.println("Enter the name you want update : ");
            String updateName = scanner.nextLine();
            System.out.println("Enter the price you want update : ");
            double updatePrice = Double.parseDouble(scanner.nextLine());
            Product dataUpdate = new Product(updateID, updateName, updatePrice);
            int index = products.indexOf(checkID(updateID));
            products.set(index, dataUpdate);
            System.out.println("Update complete !!!");
        } else {
            System.out.println("ID not found !!!");
        }

    }

    public Product checkID(int updateID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() != updateID) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Enter the ID you want delete : ");
        int deleteID = Integer.parseInt(scanner.nextLine());
        if (checkID(deleteID) == null) {
            System.out.println("ID not found !!!");
        } else {
            products.remove(checkID(deleteID));
            System.out.println("Delete complete.");
        }
    }

    @Override
    public void display() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void search() {
        System.out.println("Enter the name you want search : ");
        String name = scanner.nextLine();
        if (searchName(name) == null) {
            System.out.println("The product name could not be found !!!");
        } else {
            System.out.println(searchName(name));
        }
    }

    public Product searchName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == name) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void sort() {
        System.out.println("Choose the type of arrangement you want : ");
        System.out.println("1. Increase");
        System.out.println("2. Decrease");
        System.out.println("3. Return menu");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            for (int i = 0; i < products.size() - 1; i++) {
                for (int j = 1; j < products.size(); j++) {
                    if (products.get(j).getPrice() < products.get(i).getPrice()) {
                        Product temp = products.get(i);
                        products.set(i, products.get(j));
                        products.set(j, temp);
                    }
                }
                for (Product product : products) {
                    System.out.println(product.toString());
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < products.size() - 1; i++) {
                for (int j = 1; j < products.size(); j++) {
                    if (products.get(j).getPrice() > products.get(i).getPrice()) {
                        Product temp = products.get(i);
                        products.set(i, products.get(j));
                        products.set(j, temp);
                    }
                }
                for (Product product : products) {
                    System.out.println(product.toString());
                }
            }
        } else if (choice == 3) {
            return;
        } else {
            System.out.println("Your choice is wrong !!! Please choose again.");
        }
    }
}
