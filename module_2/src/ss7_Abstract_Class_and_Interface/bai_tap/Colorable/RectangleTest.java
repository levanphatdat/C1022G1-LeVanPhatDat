package ss7_Abstract_Class_and_Interface.bai_tap.Colorable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3, 4);
        System.out.println(rectangle);
    }
}
