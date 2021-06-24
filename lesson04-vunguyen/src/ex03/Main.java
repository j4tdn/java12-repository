package ex03;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            toString(pascalTriangle(i));
        }
    }

    private static void toString(int[] arrs) {
        for (int i : arrs) {
            System.out.printf("%-5d", i);
        }
        System.out.println();
    }

    // recursive pascal triangle
    private static int[] pascalTriangle(int line) {
        if (line == 0) {
            int[] arrs = new int[2];
            arrs[0] = 1;
            arrs[1] = 1;
            return arrs;
        } else {
            int count = line + 2;
            int[] arrs = new int[count];
            for (int i = 0; i < count; i++) {
                if (i == 0 || i == arrs.length - 1) {
                    arrs[i] = 1;
                } else {
                    arrs[i] = pascalTriangle(line - 1)[i - 1] + pascalTriangle(line - 1)[i];
                }
            }
            return arrs;
        }
    }
}
