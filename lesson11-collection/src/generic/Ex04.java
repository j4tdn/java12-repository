package generic;

import java.util.Arrays;
import java.util.List;

/**
 * wildcard in generics type
 * ?: wild card
 *Upper bounded wildcard
 *Lower bounded wildcard
 */
public class Ex04 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		List<Float> floatList = Arrays.asList(1f,2f,3f,4f,5f);
		List<Double> DoubleList= Arrays.asList(1d,2d,3d,4d,5d);
		List<String> strList = Arrays.asList("a", "b", "c", "d", "e");

		List<Number> numberList=Arrays.asList(1,1d,1f);
		List<CharSequence>chaList=Arrays.asList("x","y");
		
		//================================
		printf1(chaList);
		printf1(strList);
		
		//=============================
		printf2(numberList);
		
		
	}
	
	//Upper bounded wildcard: ? bao gồm charsequence và con của nó
	private static void printf1(List<? extends CharSequence> elements) {
		for(Object element: elements) {
			System.out.println(element+ " ");
		}
		System.out.println();
	}
	
	//Upper bounded wildcard: ? bao gồm Integer và cha của nó
	private static void printf2(List<? super Integer> elements) {
		for(Object element: elements) {
			System.out.println(element+ " ");
		}
		System.out.println();
	}
}

