package ss7_Abstract_Class_and_Interface.bai_tap.Resizeable;

public class Square extends Geometry {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return Math.pow(this.edge, 2);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of Square resize : " + (getArea() + getArea() * percent / 100));
    }
}
