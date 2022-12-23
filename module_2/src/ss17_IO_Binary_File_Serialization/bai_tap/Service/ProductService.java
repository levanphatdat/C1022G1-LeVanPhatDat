package ss17_IO_Binary_File_Serialization.bai_tap.Service;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;
import ss17_IO_Binary_File_Serialization.bai_tap.Repository.IProductRepository;
import ss17_IO_Binary_File_Serialization.bai_tap.Repository.ProductRepository;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void add(Product product) {
        iProductRepository.add(product);
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    @Override
    public void search(String string) {
        iProductRepository.search(string);
    }
}
