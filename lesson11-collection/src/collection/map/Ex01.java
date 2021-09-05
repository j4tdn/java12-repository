package collection.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;


public class Ex01 {
	/*
	 * Khi HashMap put() vào một giá trị thì nó sẽ kiểm tra key có tồn tại chưa
	 * nếu key có rồi thì nó sẽ ghi đề giá trị cũ vào giá trị mới
	 */
	public static void main(String[] args) {
		//null first
		Comparator<Integer> keycomp1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer k1, Integer k2) {
				if(k1==null) {
					return -1;
				}
				if(k2==null) {
					return 1;
				}
				return k2.compareTo(k1);
			}
		};
		Comparator<Integer>keycomp2 = Comparator.nullsFirst(Comparator.comparing(Function.identity()));
		//                            Comparator.nullsFirst(Comparator.comparing(x-> x));
		
		
		//model vehicle
		//Map<Integer, String>model=new HashMap<>();
		Map<Integer, String>model=new TreeMap<>(keycomp2); 
		model.put(92, "QN");
		model.put(43, "DN");
		model.put(75, "TTH");
		model.put(null, "Undifined1");
		model.put(74, "QT");
		model.put(43, "DN01");
		model.put(null, "Undifined");
		model.putIfAbsent(74, "QT 01");  
		//hàm putIfAbsent sẽ kiểm tra nếu key chưa có
		//thì mới put ,nếu key có rồi thì trả về gtri cũ
		
		
		String v1=model.get(88);
		String v2=model.getOrDefault(88, "dfvl");
		String v3=model.get(92);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println("==============================");
		String removedValue1=model.remove(123);
		String removedValue2=model.remove(92);
		System.out.println("removedValue1: "+removedValue1);
		System.out.println("removedValue2: "+removedValue2);
		System.out.println("==============================");
		System.out.println("size "+model.size());
		System.out.println("==============================");
		iterate(model);
		System.out.println();
		iterateByKey(model);
		iterateByValue(model);
	}
	//iterate via entry
	private static void iterate(Map<Integer, String>model) {
		Set<Entry<Integer, String>>entrySet = model.entrySet();
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
		}
	}
	
	//iterate via key
	private static void iterateByKey(Map<Integer, String>model) {
		Set<Integer> keys= model.keySet();
		System.out.println("iterate via key: ");
		for(Integer key:keys) {
			System.out.print(key+" ");
		}
		System.out.println();
	}
	//iterate via value
		private static void iterateByValue(Map<Integer, String>model) {
			  Collection<String> values = model.values();
			  System.out.println("iterate via value: ");
			for(String value:values) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
}
