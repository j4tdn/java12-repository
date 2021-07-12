package declaration;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		int[] i1 = new int[3];
		int[] b = { 1, 2, 5 };
		int[] c = new int[] { 4, 7, 2 };
		System.out.println("i1: "+i1.getClass().getSimpleName());
		
		String[] s1=new String[2];
		String[] s2= {"a","b"};
		String[] s3=new String[] {"a","b","c"};
		System.out.println("s1: "+s1.getClass().getSimpleName());
		
		//for-index
		for(int i=0;i<s2.length;i++) {
			System.out.println("s["+i+"] = "+s2[i]);
		}
		//foreach
		int index=0;
		for(String s:s2) {
			System.out.println("s2["+index+"] ="+s);
		}
		
		
		Item item1=new Item(1,"A",20);
		Item item2=new Item(1,"B",30);
		Item item3=new Item(1,"C",40);
		Item[] items=new Item[3];
		Item[] good= {item1,item2};
		Item[] things= new Item[]{item1,item2};
		
		
	}

	private static int[] initNbers() {
		return new int[] { 1, 5, 8 };
	}
}
