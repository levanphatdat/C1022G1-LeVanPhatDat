package ss3_mang_va_phuong_thuc_trong_Java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the col:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter number the index [" + i + "][" + j + "] of the array");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("The array just entered is:");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        System.out.println("Enter the col you want sum");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < row; i++) {
            sum += arr[i][num];
        }
        System.out.println("Sum of column " + num + " is " + sum);
    }
}
