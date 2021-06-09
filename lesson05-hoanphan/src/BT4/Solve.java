package BT4;

import java.util.Scanner;

public class Solve {
	static Scanner sc = new Scanner(System.in);
	public static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	        return UCLN(a-b,b);
	    else
	        return UCLN(a,b-a);
	}
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	public static int getLeastCommonMultiple(int a[],int n){
	    int temp = BCNN(a[0], a[1] );
	    for(int i=2;i<n;i++){
	        temp = BCNN(temp, a[i]);    
	    }
	    return temp;
	}
	
    public static void main(String[] args) {

    		int arr[] = new int[20];
    	    int n;
    	    System.out.print("nhap n phan tu: ");
    	    n = sc.nextInt(); 
    	    
            System.out.println("Nhap cac phan tu cua mang: ");
		    for(int i=0;i<n;i++) {
		        System.out.printf("a[%d] = ", i);
		        arr[i]= sc.nextInt();      
		    }
		    System.out.println("BCNN cua mang la : "+ getLeastCommonMultiple(arr,n));
    	   
    }
	
}
