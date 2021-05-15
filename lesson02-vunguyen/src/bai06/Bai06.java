package bai06;

import java.util.ArrayList;

public class Bai06 {
    public static void main(String[] args) {
        System.out.println("So nguyen to thu 200 la " + findPrimeNumber(200));
    }

    public static int findPrimeNumber(int position) {
        final int MAX_VALUE = 10000000;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] intNumbers = new boolean[MAX_VALUE];
        for (int i = 0; i < MAX_VALUE; i++) {
            intNumbers[i] = true;
        }

        for (int i = 2; i * i < MAX_VALUE; i++) {
            for (int k = i * i; k < MAX_VALUE; k += i) {
                intNumbers[k] = false;
            }
        }

        for (int i = 2; i < MAX_VALUE; i++) {
            if (intNumbers[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.get(position - 1);
    }
}
