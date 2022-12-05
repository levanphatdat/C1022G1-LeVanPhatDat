package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first array:");
        int length1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the length of the second array:");
        int length2 = Integer.parseInt(sc.nextLine());
        int arr1[] = new int[length1];
        int arr2[] = new int[length2];
        System.out.println("Enter the first array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Input number the index[" + i + "] of the first array");
            int value = Integer.parseInt(sc.nextLine());
            arr1[i] = value;
        }
        System.out.println("Enter the second array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Input number the index[" + i + "] of the second array");
            int value = Integer.parseInt(sc.nextLine());
            arr2[i] = value;
        }
        System.out.println("The first array is:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("The second array is:");
        System.out.println(Arrays.toString(arr2));
        int length3 = length1 + length2;
        int[] arr3 = new int[length3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("The third array is:");
        System.out.println(Arrays.toString(arr3));
    }
}
