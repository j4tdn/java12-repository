package bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class App {
	public static void main(String[] args) {
		int[] array = {3,15,21,0,15,17,21};
		getUniqueNumbers(array);
		for(int i = 0; i < getUniqueNumbers(array).length; i++) {
			System.out.println(getUniqueNumbers(array)[i]);
		}
	}
	
	private static int[] getUniqueNumbers(int[] array) {
		List<Integer> newArrayList = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			for(int j = 0; j < array.length; j++) {
				
				if(j == i) {
					continue;
				}
				if(array[i] == array[j]) {
					count++;
					break;
				}
			}
			if(count == 0) {
				newArrayList.add(array[i]);
			}
		}
		newArrayList.sort((a,b) -> (a - b));
		int[] newArray = new int[newArrayList.size()];
		for(int i = 0; i < newArrayList.size(); i++) {
			newArray[i] = newArrayList.get(i);
		}
		return newArray;
	}
}
