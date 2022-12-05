package ss2_vong_lap_trong_Java.bai_tap;

public class IsPrimeLessThan100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị 100 số nguyên tố bé hơn 100.");
        int n = 2;
        while (n < 100) {
            int countSNT = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countSNT++;
                }
            }
            if (countSNT == 2) {
                System.out.println(n);
            }
            n++;
        }
    }
}
