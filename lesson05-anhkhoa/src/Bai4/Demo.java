package Bai4;

public class Demo {
	public static void main(String[] args) {
		int[] a= {2,3,4,5};
	System.out.println(BCNN_ARR(a, a.length));	
		
		
	}
	private static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	      return UCLN(a-b,b);
	    else
	       return UCLN(a,b-a);
	}
	private static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	private static int BCNN_ARR(int a[],int n){
        int arr = BCNN(a[0], a[1] );
        for(int i=2;i<n;i++){
            arr = BCNN(arr, a[i]);    
        }
        return arr;
    }
}
