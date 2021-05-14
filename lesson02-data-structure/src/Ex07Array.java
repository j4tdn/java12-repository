
public class Ex07Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		String[] b = new String[5];
		a[1] = 10;
		b[3] = "hello";
		System.out.println("a[1]=" + a[1]);
		System.out.println("b[2]=" + b[2]);
		int[] c = { 3, 4, 5, 6, 6 };
		System.out.println("c[1]" + c[1]);
		// loop
		for (int i = 0; i < c.length; i++) {
             System.out.println(c[i]);
		}
		//foreach
		for(int citem:c) {
			System.out.println(citem);
		}
		for(String bitem:b) {
			System.out.println(bitem);
		}
	}

}
