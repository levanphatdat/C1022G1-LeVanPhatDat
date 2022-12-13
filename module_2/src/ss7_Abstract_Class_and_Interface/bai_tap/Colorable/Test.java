package ss7_Abstract_Class_and_Interface.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 5);
        shapes[1] = new Rectangle("white", false, 5, 7);
        shapes[2] = new Square("black", true, 6);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                IColorable squareInterface = (Square) shape;
                System.out.println(shape);
                squareInterface.howToColor();
                System.out.println();
            }
            if (shape instanceof Circle) {
                IColorable circleInterface = (Circle) shape;
                System.out.println(shape);
                circleInterface.howToColor();
                System.out.println();
            }
            if (shape instanceof Rectangle) {
                IColorable rectangleInterface = (Rectangle) shape;
                System.out.println(shape);
                rectangleInterface.howToColor();
                System.out.println();
            }
        }

    }
}
