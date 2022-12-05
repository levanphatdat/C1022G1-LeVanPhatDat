package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenght:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number the index[" + i + "]");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Input index X:");
        int x = Integer.parseInt(scanner.nextLine());
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
