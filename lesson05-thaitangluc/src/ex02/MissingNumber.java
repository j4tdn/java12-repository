package ex02;

public class MissingNumber {
	public static void main(String[] args) {
		int[] A = {3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(A));
	}

	public static int getMissingNumber(int[] arr) {
		sortArr(arr);
		// 1 2 3 5 6
		if (arr[0] != 1)
			return 1;
		if (arr[arr.length - 1] != arr.length+1)
			return arr.length+1;
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) == 2)
				return (arr[i]+1);
		}
		return 0;
	}

	public static void sortArr(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
