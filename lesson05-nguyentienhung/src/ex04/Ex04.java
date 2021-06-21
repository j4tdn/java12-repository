package ex04;

public class Ex04 {
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

public static int getLeastCommonMultiple(int a[]){
        int temp = BCNN(a[0], a[1] );
        for(int i=2;i<a.length;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
    }
public static void main(String[] args) {
	int []arr= {1,2,3,4,5,6,7};
	System.out.println("BCNN: "+getLeastCommonMultiple(arr));
}
}
