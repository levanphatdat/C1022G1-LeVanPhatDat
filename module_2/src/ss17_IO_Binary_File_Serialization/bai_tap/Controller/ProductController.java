package ss17_IO_Binary_File_Serialization.bai_tap.Controller;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;
import ss17_IO_Binary_File_Serialization.bai_tap.Service.IProductService;
import ss17_IO_Binary_File_Serialization.bai_tap.Service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--------------------\n" +
                    "1. Add product.\n" +
                    "2. Display product.\n" +
                    "3. Search product\n" +
                    "4. Exit\n" +
                    "Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the code : ");
                    String addCode = scanner.nextLine();
                    System.out.println("Enter the name : ");
                    String addName = scanner.nextLine();
                    System.out.println("Enter the manufacturer : ");
                    String addManufacturer = scanner.nextLine();
                    System.out.println("Enter the price : ");
                    double addPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter the other : ");
                    String addOther = scanner.nextLine();
                    Product product = new Product(addCode, addName, addManufacturer, addPrice, addOther);
                    iProductService.add(product);
                    System.out.println("Add product complete.");
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    System.out.println("Enter the name your want search : ");
                    String string = scanner.nextLine();
                    iProductService.search(string);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choice again !!!");
            }
        } while (true);
    }
}
