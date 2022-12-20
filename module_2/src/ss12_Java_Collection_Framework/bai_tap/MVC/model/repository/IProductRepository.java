package ss12_Java_Collection_Framework.bai_tap.MVC.model.repository;

import ss12_Java_Collection_Framework.bai_tap.MVC.model.model.Product;

public interface IProductRepository {
    //    thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp
    void add();

    void update(Product product);

    Product checkID(int id);

    void delete();

    void display();

    void search();

    void sort();
}
