package data;

public class Ex04 {

	public static void main(String[] args) {
				//object type
				//HEAP
				//Store constant pool: vung nho luu tru hang so
				Integer oa = 20;
				Integer ob = 20;
				Integer ob1 = 50;
				Integer oa1 = 50;

				//Store at normal HEAP
				//SElf: new to create object
				Integer oc = new Integer(40);
				Integer od = new Integer(40);
				
				hash("oa",oa);
				hash("ob",ob);
				hash("ob1",oa1);
				hash("oa1",ob1);
				
				hash("oc",oc);
				hash("od",od);
				
			//101 cell
				String s1 = "A";
				String s2 ="A";
				//....
				String s100 = "A";
				
			//200 cell
				String ss1 = new String("A");
				String ss2 = new String("A");
				//....
				String ss100 = new String("A");

			
			//kieu du lieu khong co dia chi ma chi luu value o Stack	
				int a = 4;
				int b = 4;
				
		//	vd gan a =5 thi o stack xoa a = 4 va cap nhat a = 5
				
				oa = 50;
		//thi o stack oa van giu nguyen nhung tro toi o nho o consstant pool o heap co gia tri bang 50

				
	}
	private static void hash(String text, Integer input) {
		System.out.println(text + System.identityHashCode(input));
	}

}
