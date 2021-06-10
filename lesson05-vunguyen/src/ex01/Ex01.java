package ex01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 15, 21, 0, 15, 17, 21};
        System.out.println(Arrays.toString(A));
        System.out.println("Unique numbers: " + Arrays.toString(getUniquenumbers(A)));
    }

    private static int[] getUniquenumbers(int[] A) {
        // list element appear once in arrays
        int countElement = 0;
        int[] tempArrs = new int[100];
        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < A.length; k++) {
                if (k == i) {
                    continue;
                }
                if (A[k] == A[i]) {
                    break;
                }
                if (k == A.length - 1) {
                    tempArrs[countElement++] = A[i];
                }
            }
        }
        int[] B = Arrays.copyOf(tempArrs, countElement);
        // arrange element in ascending oder
        for (int i = 0; i < B.length; i++) {
            for (int k = i + 1; k < B.length; k++) {
                if (B[k] < B[i]) {
                    int tempVal = B[i];
                    B[i] = B[k];
                    B[k] = tempVal;
                }
            }
        }
        return B;
    }
}
