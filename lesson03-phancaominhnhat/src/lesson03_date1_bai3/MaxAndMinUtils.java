package lesson03_date1_bai3;


public class MaxAndMinUtils {
	private MaxAndMinUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static MaxAndMin[] elementMinOfRow(int m, int n, int[][] arr) {
		MaxAndMin[] min = new MaxAndMin[m];
		for(int i = 0; i < m; i++) {
			min[i] = new MaxAndMin(0,0,Integer.MAX_VALUE);
			for(int j = 0; j < n; j++) {
				if(arr[i][j] < min[i].getValue()) {
					min[i].setValue(arr[i][j]);
					min[i].setElementCol(j);
					min[i].setElementRow(i);
				}
			}
		}
		return min;
	}
	
	public static MaxAndMin[] elementMaxOfCol(int m, int n, int[][] arr, MaxAndMin[] min) {
		MaxAndMin[] max = new MaxAndMin[m];
		for(int j = 0; j < min.length; j++) {
			max[j] = new MaxAndMin(0,0,Integer.MIN_VALUE);
			for(int i = 0; i < m; i++) {
				if(arr[i][min[j].getElementCol()] > max[j].getValue()) {
					max[j].setValue(arr[i][min[j].getElementCol()]);
					max[j].setElementCol(min[j].getElementCol());
					max[j].setElementRow(i);
				}
			}
		}
		return max;
	}
	
	public static MaxAndMin isElementSaddle(MaxAndMin[] min, MaxAndMin[] max) {
		for(int i = 0; i < min.length; i++) {
			if(min[i].getValue() == max[i].getValue()) {
				return min[i];
			}
		}
		return null;
	}
}
