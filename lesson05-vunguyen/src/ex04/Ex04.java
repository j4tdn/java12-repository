package ex04;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] A = new int[]{2, 4, 3, 6, 9};
        System.out.println(Arrays.toString(A));
        System.out.println("Least common multiple number: " + getLeastCommonMultiple(A));
    }
    private static int getLeastCommonMultiple(int[] A) {
        //find biggest common divide number in arrays
        int biggestCommonDivideNumber = 1;
        for (int i = 2; i <= 10; i++) {
            boolean flag = true;
            for (int iA: A) {
                if (iA % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                biggestCommonDivideNumber = i;
            }
        }
        // find least common multiple number
        int multipleNumber = 1;
        for (int i: A) {
            multipleNumber *= i;
        }
        return (int) (multipleNumber / Math.pow(biggestCommonDivideNumber, A.length - 1));
    }
}
