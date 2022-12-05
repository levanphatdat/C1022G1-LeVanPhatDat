package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the SIZE of the array:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + "th element.");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The smallest value in the array is: " + min);

    }
}
