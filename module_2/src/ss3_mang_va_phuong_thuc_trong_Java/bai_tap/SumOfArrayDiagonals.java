package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter number the index [" + i + "][" + j + "] of the array");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("The array just entered is:");
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i][i];
        }
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (i == j) {
//                    sum += arr[i][j];
//                }
//                if (i + j == length - 1) {
//                    sum += arr[i][j];
//                }
//            }
//        }
//        sum-=arr[length-2][length-2];
        System.out.println("Sum Of Array Diagonals Is " + sum);
    }
}

