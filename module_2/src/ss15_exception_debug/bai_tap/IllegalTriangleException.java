package ss15_exception_debug.bai_tap;


import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the triangle: ");
        System.out.println("Edge a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Edge b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Edge c : ");
        double c = Double.parseDouble(scanner.nextLine());
        try {
            checkTriangle(a, b, c);
            System.out.println("a,b,c are sides of a triangle.");
        } catch (Triangle e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTriangle(double a, double b, double c) throws Triangle {
        if (a < 0 || b < 0 || c < 0 || a + b < c || b + c < a || c + a < b) {
            throw new Triangle("a,b,c are not sides of a triangle.");
        }
    }
}
