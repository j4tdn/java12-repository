package operator;

public class Ex02 {
	public static void main(String[] args) {
		//toan tu dieu kien ? :
		//expression ? A : B ;
//		if(expression) {
//			A
//		}else {
//			B
//		}
		int num = 11;
		boolean isEven = num%2==0 ;
		System.out.println(isEven);
		
		//max 2 so
		int f = 7;
		int s= 8;
		int t = 22;
		System.out.println("max: "+ max(f,s));
		System.out.println("max: "+ max(f,s,t));
		
		int x =5,y=2,z =3;
		y=y+ x++ + z++ + ++z + ++x - y-- +z;
		System.out.println(" "+x+" "+y+" "+z);

		
	}
	private static int max(int f, int s) {
		return f > s ? f : s;
	}
	private static int max(int f, int s, int t) {
	//	return max(t, max(f, s));
		int max = f > s ? f : s;
		return max > t ? max :t;
	//	return (f > s ? f : s)> t ? (f > s ? f : s): t;
	}
	

}
