package ss12_Java_Collection_Framework.bai_tap.MVC.model.service;

import ss12_Java_Collection_Framework.bai_tap.MVC.model.model.Product;

public interface IProductService {
    void add();

    void update(Product product);

    Product checkId(int id);

    void delete();

    void display();

    void search();

    void sort();
}
