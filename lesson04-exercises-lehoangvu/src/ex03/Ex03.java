package ex03;

import java.util.Scanner;

public class Ex03 {
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {


            System.out.print("Enter Integer type  n: ");
            int n = Integer.parseInt(sc.nextLine());
            int[][] A = new int[n + 1][n + 2];

            int i, j;
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= i + 1; j++) {
                    if (j == 0 || j == i + 1) {
                        A[i][j] = 1;
                    } else {
                        A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
                    }
                    System.out.printf("%-5d", A[i][j]);// xuat
                }
                System.out.println();
            }
        }
}
