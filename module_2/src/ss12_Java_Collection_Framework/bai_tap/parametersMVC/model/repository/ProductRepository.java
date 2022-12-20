package ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.repository;

import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "banana", 10));
        list.add(new Product(2, "lemon", 5));
        list.add(new Product(3, "watermelon", 15));
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void display() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Override
    public Product checkID(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == product.getId()) {
                list.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Product p : list) {
            if (p.getId() == id) {
                list.remove(p);
            }
        }
    }

    @Override
    public void search(String string) {
        boolean check = false;
        for (Product c : list) {
            if (c.getName().contains(string)) {
                System.out.println(c);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Name does not exist.");
        }
    }

    @Override
    public void sort(int num) {
        if (num == 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(j).getPrice() < list.get(i).getPrice()) {
                        Product temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
            for (Product product : list) {
                System.out.println(product);
            }
        } else if (num == 2) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(j).getPrice() > list.get(i).getPrice()) {
                        Product temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }

            }
            for (Product product : list) {
                System.out.println(product);
            }
        } else {
            System.out.println("Your choice is wrong. ");
        }
    }


}
