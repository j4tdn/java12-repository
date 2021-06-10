package Bai1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	private static int a[] = { 3, 15, 21, 0, 15, 17, 21 };

	public static void main(String[] args) {
		for (var item : Find()) {
			System.out.println(item);
			
		}
	}

	private static Object[] Find() {
		List<Integer> arr = new ArrayList<Integer>();
		int b[] = a;
		for (int item : a) {
			int count = 0;
			for (int item1 : b) {
				if (item == item1)
					count++;
			}
			if (count == 1)
				arr.add(item);
		}
		return arr.toArray();
	}
}
