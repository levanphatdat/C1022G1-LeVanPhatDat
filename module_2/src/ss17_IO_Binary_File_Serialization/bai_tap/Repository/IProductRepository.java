package ss17_IO_Binary_File_Serialization.bai_tap.Repository;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;

public interface IProductRepository {
    //    thêm, hiển thị, tìm kiếm
    void add(Product product);

    void display();

    void search(String string);
}
