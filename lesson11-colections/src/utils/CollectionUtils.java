package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionUtils {
	public CollectionUtils() {
		// TODO Auto-generated constructor stub
	}
	
	///... 
	public static List<Integer> init(Integer ... elements){
		List<Integer> result = new ArrayList<>();
		result.addAll(Arrays.asList(elements));
		return result;
	}
	public static void printf(List<?> objects) {
		for(Object o: objects) {
			System.out.println(o + " ");
		}
	}
}
