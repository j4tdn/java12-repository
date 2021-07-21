package learn.again;

public class Ex03 {
	public static void main(String[] args) {
		// 1d
		int[] d1 = { 1, 2 };

		// 2d
		int[][] d2 = new int[3][4];
		int[][] d22 = { { 1, 2, 3, 4 }, { 1, 2, 4, 5 }, { 1, 1, 2, 4 } };
		// for
		for (int row = 0; row < d22.length; row++) {
			for (int col = 0; col < d22[row].length; col++) {
				System.out.print(d22[row][col] + " ");
			}
			System.out.println(d22[row]);
		}
		Dimesion[] dims = { new Dimesion(1, 2, 3, 4), new Dimesion(1, 2, 3, 4), new Dimesion(1, 2, 3, 4) };
		for (int i = 0; i < dims.length; i++) {
			
		}
		// 3d
		int[][][] d3 = new int[3][2][2];
		int[][][] d32 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 9, 10 }, { 11, 12 } } };
	}

}
