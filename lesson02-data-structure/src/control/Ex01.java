package control;

public class Ex01 {
enum Level{
	BAD,MEDIUM,PRETYY_GOOD,GODD
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int max(int a,int b) {
		if(a>b)return a;
		return b;
	}
	public static int max(int a,int b,int c) {
		int  max=a>b?a:b;
		if(max<c)max=c;
		return max;
	}

}
