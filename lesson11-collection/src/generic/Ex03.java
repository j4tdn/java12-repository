package generic;

public class Ex03 {
public static void main(String[] args) {
	IList<String> sequences =new JavaList<>();
	sequences.add("how are you");
	sequences.add("enjoy our page");
	sequences.add("stay safe and tke care");
	sequences.add("how are you");
	sequences.add("enjoy our page");
	sequences.add("stay safe and tke care");
	sequences.show();
	System.out.println("size:" +  sequences.size());
	int count=sequences.coun(e->e.startsWith("how"));
	System.out.println(count);
}
}
