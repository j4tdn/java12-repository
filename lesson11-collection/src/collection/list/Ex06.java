package collection.list;

import java.util.List;

import static utils.CollectionUtils.*;

public class Ex06 {
/*
	addAll: Cộng chuỗi
	removeAll:  xoá các phần tử giống nhau
	retainAll: xoá các phần tử ko giống nhau
*/
public static void main(String[] args) {
	List<Integer> first = init(1,2,3,4);
	List<Integer> second = init(3,4,5,6);
	
	//first.addAll(second); => 1 2 3 4 5 6
	//first.removeAll(second); => 1 2
	first.retainAll(second); // => 3 4
	
	
	show(first);
	show(second);
	
}
}
