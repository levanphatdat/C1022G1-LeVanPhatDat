package ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.service;

import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.model.Product;
import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.repository.IProductRepository;
import ss12_Java_Collection_Framework.bai_tap.parametersMVC.model.repository.ProductRepository;

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
    public Product checkID(int id) {
        return iProductRepository.checkID(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public void search(String string) {
        iProductRepository.search(string);
    }

    @Override
    public void sort(int num) {
        iProductRepository.sort(num);
    }
}
