package collection.list;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static utils.CollectionUtils.*;

/**
 * Arrays.asList
 * Use Contains,Collection.reverse(),Collection.shuffle
 * method contains sẽ sử dụng hàm equal -> khi dùng với kiểu đối tượng, ta nên override equal
 */
public class Ex05 {
public static void main(String[] args) {
	// Arrays.asList: list fixed-size
	List<String> elements = Arrays.asList("a", "b", "c", "d");
	printf(elements);

	//elements.add("sss"); //error, because fixed-size
	
	// Use random
	System.out.println("Random element: " + elements.get(new Random().nextInt(elements.size())));

	// Contain
	System.out.println("contains b? - " + elements.contains(new String("b")));

	// reverse
	Collections.reverse(elements);
	printf(elements);

	// shufle :trộn/xào list
	Collections.shuffle(elements);
	printf(elements);
	
}
}
