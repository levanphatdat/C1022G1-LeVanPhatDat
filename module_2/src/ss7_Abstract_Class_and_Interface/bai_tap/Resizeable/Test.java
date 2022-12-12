package ss7_Abstract_Class_and_Interface.bai_tap.Resizeable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(5);
        geometries[1] = new Rectangle(5, 7);
        geometries[2] = new Square(6);
        for (Geometry geometry : geometries) {
            geometry.resize(0);
            double percent = Math.floor(Math.random() * 100);
            System.out.println(percent);
            geometry.resize(percent);
            System.out.println("");
        }
    }
}
