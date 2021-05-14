package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Random01 {

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
