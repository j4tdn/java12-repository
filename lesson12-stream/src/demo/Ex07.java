package demo;

import java.util.List;
import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

public class Ex07 {
	public static void main(String[] args) {
		//stream is "sequences of elements from Source that helps manipulate collections of data"
		//source: menu
		List<Dish> menu = DishUtils.getAll();
		
		//menu : source -> stream -> intermediate operation -> stream ->  terminal operation -> non-stream type(long, collection, array)
		//lazy-operation : khi cần lấy ra mới lấy ra sd -> khi gọi đến terminal operation thì thực thi
		
		
		menu.stream()
			.filter(dish -> {
				System.out.println("filter: " + dish.getName());
				 return Kind.MEAT.equals(dish.getKind());
			})
			.map(dish -> {
				System.out.println("map: " + dish.getName());
				return dish.getName();
			});
		System.out.println("================");
		//meatDishes.forEach(System.out::println);
		
		
		//What is Stream
		//là tập hợp các phần tử từ source giúp mình thao tác với dữ liệu
		//có 3 phần chính: source - intermediate operation - terminal operation - TAGET
		//STEPS: source -> stream -> intermediate operation -> stream ->  terminal operation -> non-stream type(long, collection, array)
		
		//INTERMEDIATE OPERATION:  return type Stream<T>
		//TERMINAL OPERATION: return long, array, collection
							// >> count, collection, forEach, toArray
		
		//Feature:
		//1. Traversable once only
		//2. Stream & Collection
		//Same: Cam store and manipulate with data
		//Diff: Collection: Focus on store data
		//		Stream: 	Focus on manipulate data.
		//3. Intermediate operation will do nothing until terminal operation invoked
		//4: Internal iteration: duyệt phía bên trong
		//5. Express a query than ad học implementation
		
	}
}
