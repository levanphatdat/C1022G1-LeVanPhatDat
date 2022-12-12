package ss7_Abstract_Class_and_Interface.bai_tap.Resizeable;

public class Rectangle extends Geometry implements IResizeable {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Rectangle resize : " + (getArea() + getArea() * percent / 100));
    }
}
