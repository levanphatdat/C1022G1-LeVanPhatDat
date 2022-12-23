package ss17_IO_Binary_File_Serialization.bai_tap.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serializationUID = 2L;
    private String code;
    private String name;
    private String manufacturer;
    private double price;
    private String other;

    public Product() {
    }

    public Product(String code, String name, String manufacturer, double price, String other) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other = other;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product { " +
                "code = " + code +
                ", name = " + name +
                ", manufacturer = " + manufacturer +
                ", price = " + price +
                ", other = " + other +
                '}';
    }
}
