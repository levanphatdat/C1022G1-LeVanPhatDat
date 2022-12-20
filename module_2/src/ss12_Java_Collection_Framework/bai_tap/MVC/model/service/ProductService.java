package ss12_Java_Collection_Framework.bai_tap.MVC.model.service;

import ss12_Java_Collection_Framework.bai_tap.MVC.model.repository.IProductRepository;
import ss12_Java_Collection_Framework.bai_tap.MVC.model.repository.ProductRepository;

public class ProductService implements IProductService {

    private IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void add() {
        iProductRepository.add();
    }

    @Override
    public void update() {
        iProductRepository.update();
    }

    @Override
    public void delete() {
        iProductRepository.delete();
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    @Override
    public void search() {
        iProductRepository.search();
    }

    @Override
    public void sort() {
        iProductRepository.sort();
    }
}
