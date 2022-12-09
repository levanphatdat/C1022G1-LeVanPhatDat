package ss6_inheritance.bai_tap.Cricle_Cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + getHeight() +
                ", radius = " + getRadius() +
                ", color = " + getColor() +
                ", area = " + getVolume() +
                '}';
    }
}
