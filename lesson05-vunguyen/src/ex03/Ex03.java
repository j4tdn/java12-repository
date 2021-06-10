package ex03;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("(8, 2) " + isPowerOf(8, 2));
        System.out.println("(2, 8) " + isPowerOf(2, 8));
        System.out.println("(6, 2) " + isPowerOf(6, 2));
        System.out.println("(20, 4) " + isPowerOf(20, 4));
        System.out.println("(64, 4) " + isPowerOf(64, 4));
    }

    private static boolean isPowerOf(int a, int b) {
        if (a < 0 || b < 0) {
            return false;
        }
        return isAPowerOfB(a, b) || isAPowerOfB(b, a);
    }

    private static boolean isAPowerOfB(int A, int B) {
        if (B == 0 && A == 1) {
            return true;
        }
        if (B == 1 || A == 1) {
            return true;
        }
        if (A % B == 0) {
            return isAPowerOfB(A / B, B);
        }
        return false;
    }
}
