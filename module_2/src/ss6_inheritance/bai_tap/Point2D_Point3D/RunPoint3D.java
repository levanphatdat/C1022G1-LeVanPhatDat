package ss6_inheritance.bai_tap.Point2D_Point3D;

public class RunPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5);
        System.out.println(point3D);
        point3D.setXYZ(5, 1, 2);
        System.out.println(point3D);
    }
}
