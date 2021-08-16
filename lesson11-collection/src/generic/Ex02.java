package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
public static void main(String[] args) {
	List<Integer> intList = Arrays.asList(1,2,3,4,5);
	List<Float> floatList = Arrays.asList(1f,2f,3f,4f,5f);
	List<Double> DoubleList= Arrays.asList(1d,2d,3d,4d,5d);
	List<String> strList = Arrays.asList("a", "b", "c", "d", "e");


//	printf(intList);
//	printf(DoubleList);
//	printf(floatList);
	
	printf(strList);
	
	printf2(2); //unboxing
	// printf2(intList); hàm này mặc dù vẫn chạy đc nhưng ko nên dùng =>bad code vì tham số ban đầu ko phải List<E> :((
}

private static <E> void printf2(E e) {
	System.out.println(e);
}

private static<E extends CharSequence> void printf(List<E> elements) {
	for(E element: elements) {
		System.out.println(element+ " ");
	}
	System.out.println();
}
}
