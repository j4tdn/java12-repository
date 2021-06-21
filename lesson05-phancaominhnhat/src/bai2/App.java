package bai2;

public class App {
	public static void main(String[] args) {
		int[] arr = {3,7,9,2,1,6,5,4,10};
		System.out.println("number missed: " + getMissingNumber(arr));
	}
	
	private static int getMissingNumber(int[] arr) {
		for(int i = 1; i <= arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(i == arr[j]) {
					count++;
				}
			}
			if(count == 0) {
				return i;
			}
		}
		return 0;
	}
}
