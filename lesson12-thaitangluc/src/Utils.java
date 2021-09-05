import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Utils {
	private Utils() {
		
	}
	
	public static <T> void printf(List<T> list){
		for(T e: list) {
			System.out.println(e);
		}
	}
	
	public static <T> void printf(Set<T> list) {
		Iterator<T> irt = list.iterator();
		while (irt.hasNext()) {
			System.out.println(irt.next());
		}
	}
}
