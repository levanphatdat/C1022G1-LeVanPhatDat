package ss7_Abstract_Class_and_Interface.bai_tap.Resizeable;

public class Circle extends Geometry {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Circle resize : " + (getArea() + getArea() * percent / 100));
    }
}
