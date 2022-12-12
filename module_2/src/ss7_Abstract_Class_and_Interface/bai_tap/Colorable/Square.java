package ss7_Abstract_Class_and_Interface.bai_tap.Colorable;

public class Square extends Shape implements IColorable {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
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
    public String toString() {
        return "Area of Square is: "
                + getArea() + ". "
                + super.toString();
    }

    @Override
    public void howToColor() {
        if (isFilled()) {
            System.out.println("Color all four sides");
        } else {
            System.out.println("No color !!!");
        }
    }
}
