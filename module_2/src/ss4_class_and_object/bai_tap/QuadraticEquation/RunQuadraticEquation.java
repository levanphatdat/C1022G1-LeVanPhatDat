package ss4_class_and_object.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number c:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta is: " + delta);
        if (delta > 0) {
            System.out.println("The equation with 2 solutions is: ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has only one solution is:");
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot3());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
