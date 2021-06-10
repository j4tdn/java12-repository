package ex02;

public class Ex02 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 7, 9, 2, 1, 6, 5, 4, 10};
        System.out.println("Missing number: " + getMissingNumber(A));
    }
    private static int getMissingNumber(int[] A) {
        for (int i = 1; i < A.length; i++) {
            for (int iA = 0; iA < A.length; iA++) {
                if (A[iA] == i) {
                    break;
                }
                if (iA == A.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
