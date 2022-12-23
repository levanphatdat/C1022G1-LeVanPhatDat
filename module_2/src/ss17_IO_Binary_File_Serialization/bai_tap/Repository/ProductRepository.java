package ss17_IO_Binary_File_Serialization.bai_tap.Repository;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;
import ss17_IO_Binary_File_Serialization.bai_tap.Util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("1", "Sirius", "Yamaha", 20, "cheap"));
        list.add(new Product("2", "Air Blade", "Honda", 48, "medium"));
        ReadAndWrite.writeList(list);
    }

    @Override
    public void add(Product product) {
        list = ReadAndWrite.readList();
        list.add(product);
        ReadAndWrite.writeList(list);
    }

    @Override
    public void display() {
        list = ReadAndWrite.readList();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Override
    public void search(String string) {
        list = ReadAndWrite.readList();
        boolean checkName = false;
        for (Product l : list) {
            if (l.getName().contains(string)) {
                System.out.println(l);
                checkName = true;
            }
        }
        if (!checkName) {
            System.out.println("Name does not exist.");
        }
    }
}
