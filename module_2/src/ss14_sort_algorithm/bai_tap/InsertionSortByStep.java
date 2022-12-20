package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size= Integer.parseInt(scanner.nextLine());
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the %d th element ",i);
            arr[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
    }

}
