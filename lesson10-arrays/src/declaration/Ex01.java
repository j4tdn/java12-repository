package declaration;

import bean.Item;

public class Ex01 {
public static void main(String[] args) {
	int[] a=new int[3];
	int[] b= {1,5,8};
	int [] c =new int[] {4,7,1};
	System.out.println("a: "+a.getClass());
	
	String[] s1=new String[2];
	String[] s2= {"a","b"};
	String[] s3=new String[] {"c","d"};
	
	Item item1=new Item(1,"A",20);
	Item item2=new Item(2,"A",23);
	Item item3=new Item(3,"A",222);
	
	Item[] items=new Item[3];
	Item[] good= {item1,item2};
	Item[] things=new Item[] {item1};
	
}
static int[] initNbers() {
	return new int[] {1,5,6};
}
}
