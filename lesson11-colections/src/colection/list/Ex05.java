package colection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import utils.CollectionUtils;

public class Ex05 {
	public static void main(String[] args) {
		//Fixed size
		List<String> elements = Arrays.asList("a","b","c","d","e");
		System.out.println("random: " + elements.get(new Random().nextInt(elements.size())));
		
		boolean isExist = elements.contains("b");
		Collections.reverse(elements);
		Collections.shuffle(elements);
		
		System.out.println("isExist: " + isExist);
		CollectionUtils.printf(elements);
	}
}
