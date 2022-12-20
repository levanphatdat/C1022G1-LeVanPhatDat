package ss12_Java_Collection_Framework.bai_tap.MVC.controller;

import ss12_Java_Collection_Framework.bai_tap.MVC.model.service.ProductService;

import java.util.Scanner;

public class ProductController {
    //    thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp
    Scanner scanner = new Scanner(System.in);
    ProductService productManager = new ProductService();

    public void menuProductManager() {
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Product Management Menu");
            System.out.println("1. Add product.");
            System.out.println("2. Update product by ID.");
            System.out.println("3. Delete product by ID.");
            System.out.println("4. Display product.");
            System.out.println("5. Search product by Name.");
            System.out.println("6. Sort products ascending, descending by Price");
            System.out.println("7. Exit.");
            System.out.println("Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.update();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice is wrong !!!");
                    break;
            }
        } while (true);
    }
}
