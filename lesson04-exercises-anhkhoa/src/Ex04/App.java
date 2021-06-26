package Ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<People> list= Arrays.asList(new GiamDoc("Khoa",2001,10,10),new TruongPhong("Bao", 2001, 10, 10), new NhanVien("A", 2001, 10, "AB"), new NhanVien("B", 2001, 10, "BA"));
		int [] a = {1,2,3,4,5,6,7};
		Integer [] c = {1,3,5,6,7};
		Icompare comp = num->num%2==0;
		Predicate<Integer> ab = num ->num%2==0;
		List<Integer> d = Arrays.stream(c).filter(comp).collect(Collectors.toList());
		//List<Integer> b = Arrays.stream(a).collect(null, null, null)
		
		for(var item : list)
		{
			System.out.println(item);
		}
		for(var item:list)
		{
			item.PrintSalary();
		}
	}
}
