package ss13_search_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left <= right) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size Array : ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Array : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d th element : \n", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter number your want search : ");
        int num = Integer.parseInt(scanner.nextLine());
        int check = binarySearch(arr, 0, size - 1, num);
        if (check != -1) {
            System.out.println("Số cần tìm ở vị trí " + check);
        } else System.out.println("Không tìm thấy giá trị " + num);
    }
}
