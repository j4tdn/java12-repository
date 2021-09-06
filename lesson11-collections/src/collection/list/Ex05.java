package collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import utils.CollectionUtils;

public class Ex05 {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("a", "b", "c","d");
		System.out.println("contain: "+elements.contains(new String("b")));
		Collections.reverse(elements);
		Collections.shuffle(elements);
		
		System.out.println(elements.toString());
	}
}
