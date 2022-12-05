package ss2_vong_lap_trong_Java.bai_tap;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố hiện ra:");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count < number) {
            int countSNT = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countSNT++;
                }
            }
            if (countSNT == 2) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
