package ss7_Abstract_Class_and_Interface.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 5);
        shapes[1] = new Rectangle("white", false, 5, 7);
        shapes[2] = new Square("black", true, 6);
        for (Shape shape : shapes) {
            shape.howToColor();
            System.out.println(shape.toString());
            System.out.println("");
        }

    }
}
