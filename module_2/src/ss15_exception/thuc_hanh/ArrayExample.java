package ss15_exception.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Array element list : ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of any element: ");
        int x = scanner.nextInt();
        try {
            System.out.println("The value of the element with index " + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index exceeds the limit of the array");
        }
    }
}
