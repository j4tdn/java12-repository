package operator;

public class Ex03 {
	public static void main(String[] args) {
		int x = 5, y = 2, z = 3;
		y = y + x++ +  z++ + ++z + ++x - y-- + z;
		
		System.out.println("x: " + x
				+ "\ny: " + y
			    + "\nz: " + z);
	}
}
