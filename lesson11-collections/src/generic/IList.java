package generic;

import java.util.function.Predicate;

/*
 *  Tạo cấu trúc dữ liệu JavaList
	Lưu trữ danh sách các phần tử (đối tượng)
	Dựa trên cấu trúc array, based index
	Có thể CRUD phần tử dễ dàng như Collection
*/
public interface IList<E> {
	int size();
	boolean isEmpty();
	boolean add(E e);
	boolean remove(int i);
	E get(int i);
	void set(int i, E e);
	void show();
	int count(Predicate<E> condition);
}