package ss17_IO_Binary_File_Serialization.bai_tap.Util;

import ss17_IO_Binary_File_Serialization.bai_tap.Model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {

    public static final String PATH = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss17_IO_Binary_File_Serialization\\bai_tap\\Data\\result.dat";

    public static List<Product> readList() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> list = (List<Product>) objectInputStream.readObject();
            return list;
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeList(List<Product> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
