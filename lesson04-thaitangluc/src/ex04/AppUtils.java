package ex04;

public class AppUtils {

	public static People[] Insert(){
		People[] peoples = new People[4];
		peoples[0] = new Director("Tran Van A", 2012, 3.2, 2.4);
		peoples[1] = new Manager("Tran Van B", 2010, 2.2, 30);
		peoples[2] = new Staff("Tran Van C", 2015, 1.2, "PB1");
		peoples[3] = new Staff("Tran Van D", 2017, 1.4, "PB2");
		return peoples;
	}
	
	public static void Print(People[] peoples) {
		for(int i = 0; i<peoples.length; i++) {
			System.out.println(peoples[i].toString());
		}
	}

}
