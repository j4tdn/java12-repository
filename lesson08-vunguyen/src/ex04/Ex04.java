package ex04;

import java.util.Scanner;

public class Ex04 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter M: ");
        long M = Long.parseLong(scanner.nextLine());

        System.out.println("Enter N: ");
        long N = Long.parseLong(scanner.nextLine());

        if (M < 2 || N < 2 || M > N || M > 300000000000000000L || N > 300000000000000000L) {
            throw new IllegalArgumentException("Invalid argument");
        }

        if (findPrimeFactors(M).equals(findPrimeFactors(N))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * Find all distinct prime factors of number
     * @param number given number
     * @return a string of prime factors
     */
    private static String findPrimeFactors(long number) {
        String primeFactors = " ";
        long divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                number /= divisor;
                if (!primeFactors.contains(" " + divisor + " ")) {
                    primeFactors += divisor + " ";
                }
            } else {
                divisor++;
            }
        }
        return primeFactors;
    }
}
