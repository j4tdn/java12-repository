package generic;
/**
 * Khi muốn giới hạn tham số truyền vào thì ta sử dụng 
 * Generic extends
 * 
 *
 */
public class Ex01 {
public static void main(String[] args) {
	//generic represents for Object type only(Integer, Double, ...)
	Integer[] ints = { 1, 2, 3, 4, 5 };
	Double[] doubles = { 1d, 2d, 3d, 4d, 5d };
	Float[] floats = { 1f, 2f, 3f, 4f, 5f };
	String[] strings= {"a","b","c","d","e"};
	
	
	
	printf1(ints);
	printf1(doubles);
	printf1(floats);
	printf1(strings);
	
	
	System.out.println("=======================");
	printf(ints);
	printf(doubles);
	printf(floats);
	
	//printf(strings); //String is not child of Number
	
}


private static void printf1(Object[] elements) {
	for(Object element: elements) {
		System.out.println(element+ " ");
	}
	System.out.println();
}

//E: generic type
//<E>: khai baos(declaration)
//E[]: Su dụng 
//E extends Number : E chỉ có thể là con của Number(Integer, Double,...)
//                   String ko phải là con của Number						
private static<E extends Number> void printf(E[] elements) {
	for(E element: elements) {
		System.out.println(element+ " ");
	}
	System.out.println();
}

}
