package ex01;

public class UniqueNumbers {
	public static void main(String[] args) {
		int[] A = { 3, 15, 21, 0, 15, 17, 21 };
		int[] ans = getUniqueNumers(A);
		for (int x : ans) {
			System.out.print(x + " ");
		}
	}

	public static int[] getUniqueNumers(int[] A) {
		sortArr(A);
		int[] cnt = new int[105];
		for (int x : A) {
			++cnt[x];
		}
		int m = 0;
		for (int x : A) {
			if (cnt[x] == 1) {
				++m;
			}
		}
		int[] ret = new int[m];
		int id = 0;
		for (int x : A) {
			if (cnt[x] == 1) {
				ret[id++] = x;
			}
		}
		return ret;
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
