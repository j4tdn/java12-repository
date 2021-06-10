package ex04;

public class Math {
	 static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	      return UCLN(a-b,b);
	    else
	       return UCLN(a,b-a);
	}
	 static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	 public static int getLeastCommonMultiple(int[] arr) {
			int num = arr[0];
			for(int i = 1; i<arr.length; i++) {
				num = BCNN(num, arr[i]);
			}
			return num;
		}
}
