package immutable;

import bean.Item;


public class Ex02 {
	/*
	 * Phân biệt  == , equal
	 * CompareTo(String)
	 */
	public static void main(String[] args) {
		String l1 = "one";
		String l2 = "two";
		String l3 = "three";
		String l4 = "two";

		String o1 = new String("mot");
		String o2 = new String("hai");
		String o3 = new String("ba");
		String o4 = new String("hai");
		
		//Use operator ==
		System.out.println("============================");
		System.out.println("(l1==l2): " + (l1==l2));
		System.out.println("(l1==l3): " + (l1==l3));
		System.out.println("(l1==l4): " + (l1==l4));
		System.out.println("(l2==l4): " + (l2==l4));
		
		System.out.println("(o1==o2): " + (o1==o2));
		System.out.println("(o1==o3): " + (o1==o3));
		System.out.println("(o1==o4): " + (o1==o4));
		System.out.println("(o2==o4): " + (o2==o4));
		
		//Use Equal
		System.out.println("==============Use equal==============");
		System.out.println("\n(l1 eq l2): " + (l1.equals(l2))); 
		System.out.println("(l1 eq l3): " + (l1.equals(l3))); 
		System.out.println("(l1 eq l4): " + (l1.equals(l4))); 
		System.out.println("(l2 eq l4): " + (l2.equals(l4))); 
		
		System.out.println("\n(o1 eq o2): " + (o1.equals(o2))); 
		System.out.println("(o1 eq o3): " + (o1.equals(o3))); 
		System.out.println("(o1 eq o4): " + (o1.equals(o4))); 
		System.out.println("(o2 eq o4): " + (o2.equals(o4))); //True Vì class String đã override lại hàm equal của class Object 
		
		
		Item i1=new Item(1, "A", 11d);
		Item i2=new Item(2, "B", 22d);
		Item i3=new Item(3, "C", 33d);
		
		System.out.println("\n(i1==i2): " + (i1==i2)); 
		System.out.println("(i1==i3): " + (i1==i3));   
		
		//default equal <=> Object.equals => similar to ==  => only compare heap 
		System.out.println("(i1 eq i2): " + (i1.equals(i2)));  
		System.out.println("(i1 eq i3): " + (i1.equals(i3)));  //False vì hàm equal mặc định dùng toán tử == =>chỉ so sánh địa chỉ heap
															  //Muốn so sánh giá trị bên trong thì ta phải override qual mặc định				
	
		System.out.println("==============Compare to==============");
		System.out.println("(l1 cpt l2): " + (l1.compareTo(l2))); 
		System.out.println("(l1 cpt l3): " + (l1.compareTo(l3))); 
		System.out.println("(l1 cpt l4): " + (l1.compareTo(l4))); 
		System.out.println("(l2 cpt l4): " + (l2.compareTo(l4))); 
		
		System.out.println("(o1 cpt o2): " + (o1.compareTo(o2))); 
		System.out.println("(o1 cpt o3): " + (o1.compareTo(o3))); 
		System.out.println("(o1 cpt o4): " + (o1.compareTo(o4))); 
		System.out.println("(o2 cpt o4): " + (o2.compareTo(o4)));
	}

}
