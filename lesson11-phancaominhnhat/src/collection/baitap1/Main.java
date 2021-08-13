package collection.baitap1;

public class Main {
	public static void main(String[] args) {
		int n = 3;
		int maxIndex = 2*n - 1;
		int[] array = new int[maxIndex + 1];
		
		for (int i = 0; i <= maxIndex; i++) {
			array[i] = i;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(array[j] + " ");
			}
			
			for (int k = 0; k < maxIndex - i*2; k++) {
				System.out.print("  ");
			}
			
			for (int t = maxIndex - i + 1; t <= maxIndex; t++) {
				System.out.print(array[t] + " ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= maxIndex; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(array[j] + " ");
			}
			
			for (int k = 0; k < maxIndex - i*2; k++) {
				System.out.print("  ");
			}
			
			for (int t = maxIndex - i + 1; t <= maxIndex; t++) {
				System.out.print(array[t] + " ");
			}
			System.out.println();
		}
	}
}
