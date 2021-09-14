package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.ArrayUtils;
import utils.CollectionUtils;

public class Ex10 {
	/**
	 * FlatMap
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> s1 = Arrays.asList("a", "b", "c");
		List<String> s2 = Arrays.asList("I", "II", "II");
		List<String> s3 = Arrays.asList(".", "*", "^");
		List<String> s4 = Arrays.asList("z", "t", "k");

		List<List<String>> s = Arrays.asList(s1, s2, s3,s4);
		List<String> apbdata = s.stream()                                //stream<List<String>>
								.flatMap(list -> list.stream())         //stream<String>
					  //hoặc	.flatMap(Collection::stream)           
								.filter(str -> str.matches("[a-z]+"))  
								.collect(Collectors.toList());
		CollectionUtils.printf(apbdata);

		System.out.println("====================");
		int[][] a = { { 1, 2, 3 }, { 2, 4, 6 }, { 10, 20, 30 } };
		int[] data = Arrays.stream(a)                           //Stream<int[]>                 
						   .flatMapToInt(Arrays::stream)        //IntStream
						   .filter(item -> item % 2 != 0)          
						   .toArray();
		ArrayUtils.printf(data);
		
	}
}
