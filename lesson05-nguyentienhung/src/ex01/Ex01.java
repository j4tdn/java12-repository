package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {
	public static List getUniqueNumbers(int array[]) {
		Arrays.sort(array);
		List<Integer> listWithDuplicateElements = new ArrayList<Integer>();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				listWithDuplicateElements.add(array[i]);
			}

		}
		Set<Integer> set = new HashSet<Integer>(listWithDuplicateElements);
		List<Integer> listWithoutDuplicateElements = new ArrayList<Integer>(set);
		return listWithDuplicateElements;

	}

	public static void main(String[] args) {
		int arr[] = { 3, 21, 0,17, 21, };
		List<Integer> Result = getUniqueNumbers(arr);

		for (int i : Result) {
			System.out.println(i);
		}

	}

}
