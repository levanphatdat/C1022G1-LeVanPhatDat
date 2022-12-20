package ss12_Java_Collection_Framework.bai_tap.parametersMVC.controller;

import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.model.Product;
import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.service.IProductService;
import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        //    thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Add prduct.");
            System.out.println("2. Update product.");
            System.out.println("3. Delete product.");
            System.out.println("4. Display prodcut.");
            System.out.println("5. Search product.");
            System.out.println("6. Sort product.");
            System.out.println("7. Exit");
            System.out.println("Input your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input the id : ");
                    int addID = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input the name : ");
                    String addName = scanner.nextLine();
                    System.out.println("Input the price : ");
                    double addPrice = Double.parseDouble(scanner.nextLine());
                    Product product = new Product(addID, addName, addPrice);
                    productService.add(product);
                    System.out.println("Add product complete.");
                    break;
                case 2:
                    System.out.println("Input the id : ");
                    int checkID = Integer.parseInt(scanner.nextLine());
                    Product product1 = productService.checkID(checkID);
                    if (product1 != null) {
                        System.out.println("Input the name : ");
                        String updateName = scanner.nextLine();
                        System.out.println("Input the price : ");
                        double updatePrice = Double.parseDouble(scanner.nextLine());
                        product1.setName(updateName);
                        product1.setPrice(updatePrice);
                        productService.update(product1);
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("Input the id : ");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    Product product2 = productService.checkID(deleteID);
                    if (product2 != null) {
                        productService.delete(deleteID);
                        System.out.println("Delete complete.");
                    } else {
                        System.out.println("ID does not exist.");
                    }
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    System.out.println("Input the String you want search : ");
                    String string = scanner.nextLine();
                    productService.search(string);
                    break;
                case 6:
                    System.out.println("1. Sort ascending by price");
                    System.out.println("2. Sort descending by price");
                    System.out.println("Input your choice : ");
                    int choiceSort = Integer.parseInt(scanner.nextLine());
                    productService.sort(choiceSort);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Please choice again !!!");
            }
        } while (true);
    }
}
