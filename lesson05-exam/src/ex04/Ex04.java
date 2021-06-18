package ex04;


import java.util.Scanner;

public class Ex04 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of molecules: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n=====================");

        System.out.println("Result: " + getLeastCommonMultiples(arr));
    }


    // BCNN: lcm stands for least common multiple
    // UCLN: gcd stands for greaest common divisor
    // lcm(a,b) = a * b / gcd(a,b)


    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


    private static int gcd(int a, int b) {
        // 16  12 => 4
//			4	12
//			4	8
//			4	4
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // 1 2 3 4 5 6
    private static int getLeastCommonMultiples(int... digits) {
        if (digits.length == 1)
            return digits[0];
        int lcm = lcm(digits[0], digits[1]);

        if (digits.length == 2)
            return lcm(digits[0], digits[1]);


        for (int i = 2; i < digits.length; i++) {
            lcm = lcm(lcm, digits[i]);

        }
        return lcm;
    }
}

