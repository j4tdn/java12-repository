package ex03;

public class Math {
	public static boolean isPowerOf(int a,int b){
		int kq =a;
		if(a%b!=0)return false;
		do {
		kq = kq/b;	
		if(kq%b!=0 && kq>1)return false;
		if( kq<=0 ) {
			return false;
		}
		
		}while(kq>1);
		
		return true;
	}
}
