package bai02;

public class Bai02 {
    public static void main(String[] args) {
        long sum = 0;
        sum = giaiThua(4) + giaiThua(7) + giaiThua(12) + giaiThua(18);
        System.out.println("Tong S = " + sum);
    }

    public static long giaiThua(int value) {
        if (value == 1) {
            return 1;
        }
        return value * giaiThua(value - 1);
    }
}
