package sorting;
import bean.SortOrder;
import static Utils.ArrayUtils.*;


/**
 * Sort mảng tăng hoặc giảm dần
 *
 */
public class Ex06 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };
		sort(numbers, SortOrder.DSC);
		printf(numbers);
	}
}
