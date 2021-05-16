package data_structures;

import java.util.Collections;

import java.util.ArrayList;

public class Ex07 {
	// tham khảo stackoverflow

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 20; i < 31; i++) {
			list.add(new Integer(i));
		}
		Collections.shuffle(list);
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
	}
}
