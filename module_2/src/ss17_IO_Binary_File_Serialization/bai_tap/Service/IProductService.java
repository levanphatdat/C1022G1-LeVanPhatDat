package ss17_IO_Binary_File_Serialization.bai_tap.Service;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;

public interface IProductService {
    void add(Product product);

    void display();

    void search(String string);
}
