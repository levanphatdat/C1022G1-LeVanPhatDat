package ss1_introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền: ");
        Scanner scanner = new Scanner(System.in);
        double vnd = 24365;
        double usd = Double.parseDouble(scanner.nextLine());
        double result = vnd * usd;
        System.out.println(usd + " USD");
        System.out.printf("Số tiền là %s VND.", result);
    }
}
