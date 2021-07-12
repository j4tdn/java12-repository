package declaration;

public class Ex03 {
public static void main(String[] args) {
	int[] d1= {1,2,3};
	
	int[][] d21=new int[3][4];
	int[][] d22= {{1,2,3},{1,2,3,4},{2,8,9,2}};
	for(int row=0;row<d22.length;row++) {
		for(int col=0;col<d22[row].length;col++) {
			System.out.println(d22[row][col]+" ");
		}
		System.out.println();
	}
	System.out.println(d22);
}
}
