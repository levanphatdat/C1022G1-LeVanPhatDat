package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the %d th element : ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                System.out.println("Swap " + arr[pos - 1] + " with " + x);
                pos--;
            }
            arr[pos] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
