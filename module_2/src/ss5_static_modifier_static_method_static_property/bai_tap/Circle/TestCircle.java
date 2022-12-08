package ss5_static_modifier_static_method_static_property.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius : " + circle.getRadius());
        System.out.println("Area : " + circle.getArea());
    }
}
