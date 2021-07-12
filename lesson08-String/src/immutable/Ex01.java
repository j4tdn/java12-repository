package immutable;



public class Ex01 {
	public static void main(String[] args) {
		
		
		String l1="hello";
		String l2="welcome";
		String l3="hello";
		
		hash("l1",l1);
		hash("l2",l2);
		hash("l3",l3);
		
		//Immutable: bất biến , ko thay đổi giá trị
		//Reality: Immutable for String value in heap
		System.out.println("=========Immutable=============");
		
		String i1="one";    // ô nhớ có giá trị là "one" sẽ đc tạo mới ở heap-constant pool
		hash("i1",i1);
		
		i1="welcome";	// ô nhớ có giá trị là "one" sẽ ko bị cập nhật mà vẫn giữ nguyên trên heap, ô nhớ "two " sẽ được tạo ra
		hash("i1",i1);
		
		System.out.println("======================");
		String o1=new String("hello");
		String o2=new String("welcome");
		String o3=new String("welcome");
		
		hash("o1",o1);
		hash("o2",o2);
		hash("o3",o3);
	}
	private static void hash(String text, String input) {
		System.out.println(text + ": "+ System.identityHashCode(input));
	}
}
