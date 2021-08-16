package declaration;

import bean.Dimension;

public class Ex04 {
	public static void main(String[] args) {
		//2D
		int [][]d32= {{1,2,3},{1,2,5},{1,2,7}};
		
		System.out.println("============");
		System.out.println("row: "+d32.length);
		System.out.println("Column: "+d32[0].length);
		
		//Loop
		System.out.println("============");
		for(int row=0;row< d32.length;row++) {
			for(int col=0;col<d32[row].length;col++) {
				System.out.print(d32[row][col]+" ");
			}
			System.out.println("\n");
		}
		
		//Tạo mảng nhìu chiều với class
		System.out.println("\n============");
		Dimension[] dims = {new Dimension(1, 2, 7, 8),new Dimension(2, 3, 4, 5), new Dimension(0, 1, 2, 3)};
		for(Dimension di:dims) {
			System.out.println(di);
		}
		System.out.println();
		
		//lấy phần tử 
		System.out.println(dims[0].getY()); //Phần tử ở dòng 0 cột 1
		
		//3D
		
	}
}
