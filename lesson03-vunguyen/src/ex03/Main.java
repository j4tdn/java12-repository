package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        boolean flag = false;
        System.out.println("Nhap so hang: ");
        row = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        col = scanner.nextInt();

        int[][] table = new int[row][col];
        int[] minRows = new int[row];
        int[] ColsHaveMinRow = new int[row];
        for (int i = 0; i < row; i++) {
            int minRow = Integer.MAX_VALUE;
            int colHasMinRow = 0;
            for (int j = 0; j < col; j++) {
                System.out.println("table[" + i  + "][" + j + "] = ");
                int value = scanner.nextInt();
                table[i][j] = value;
                if (minRow > value) {
                    minRow = value;
                    colHasMinRow = j;
                }
                if (j == col - 1) {
                    minRows[i] = minRow;
                    ColsHaveMinRow[i] = colHasMinRow;
                }
            }
        }
        for (int i = 0; i < minRows.length; i++) {
            if (minRows[i] == findMaxCol(table, row, col, ColsHaveMinRow[i])) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Co phan tu yen ngua");
        } else {
            System.out.println("Khong co phan tu yen ngua");
        }
    }
    public static int findMaxCol(int[][] table,int row, int col, int findInCol) {
        int maxCol = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            if (maxCol < table[i][findInCol]) {
                maxCol = table[i][findInCol];
            }
        }
        return maxCol;
    }
}
