package ss5_static_modifier_static_method_static_property.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazada 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazada 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
