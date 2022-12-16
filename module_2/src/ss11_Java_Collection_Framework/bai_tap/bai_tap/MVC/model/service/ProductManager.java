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

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }

    @Override
    public void sort() {

    }

    public Product infoProduct() {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name of product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }
}
