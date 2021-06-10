package bai4;

public class App {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8};
		int leastCommonMultiple = getLeastCommonMultiple(arr);
		System.out.println("boi chung nho nhat la: " + leastCommonMultiple);
	}
	
	private static int UCLN(int a, int b) {
		if(a == b) {
			return a;
		}
		if(a > b) {
			return UCLN(a - b, b);
		} else {
			return UCLN(a, b - a);
		}
	}
	
	private static int BCLN_2So(int a, int b) {
		return (a * b) / UCLN(a, b);
	}
	
	private static int getLeastCommonMultiple(int[] arr) {
		int temp = BCLN_2So(arr[0], arr[1]);

		for(int i = 2; i < arr.length; i++) {
			temp = BCLN_2So(temp, arr[i]);
		}
		return temp;
	}
}
