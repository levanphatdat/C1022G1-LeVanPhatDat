package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length:");
        int lenght = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[lenght];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number the index[" + i + "]");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Input X:");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Input index of X:");
        int index = Integer.parseInt(scanner.nextLine());
        while (index <= -1 || index >= arr.length - 1) {
            System.out.println("Re-enter index");
            index = Integer.parseInt(scanner.nextLine());
        }
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}
