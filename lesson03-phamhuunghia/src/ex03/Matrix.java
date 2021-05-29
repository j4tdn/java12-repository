package ex03;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
	private int row;
	private int col;
	private int [][]data;
	private boolean check=false;
	public Matrix(int row, int column) {
		this.row = row;
		this.col = column;
		this.data=new int[row][column];
	}

	public void setDataMatrix() {
		Random rd=new Random();
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				data[i][j]=rd.nextInt(99)+1;
			}
		}
	}
	
	public void nhapMaTran() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				data[i][j]=sc.nextInt();
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = "";
		int noe=1;
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				output += data[i][j]+"\t";
				if(noe%col==0) output+="\n";
				noe++;
			}
		}
		return output;
	}
	public void findSaddleOfMatrix(){
		String kq=saddleOfMatrix();
		if(!this.check) {
			System.out.println("Không có phân tử yên ngựa trong ma trận");
			return;
		}
		System.out.println("Phần tử yên ngựa trong ma trận là: "+saddleOfMatrix());
	}
	
	private String saddleOfMatrix() {
		int index=0;
		String output="";
		int max,min,col;
		int kq=0;
		for (int iRow = 0; iRow < this.row; iRow++)
	    {
			min=data[iRow][0];
			col=0;
			for (int iCol = 1; iCol < this.col; iCol++)
	        {
	            // Find min in a row
	            if (min > data[iRow][iCol])
	            {
	                min = data[iRow][iCol];
	                col = iCol;
	            }
	            // Find max in a column 
	            max = data[0][col];
	            for (int i = 1; i < this.row; i++)
	            {
	                if (max < data[i][col])
	                {
	                    max = data[i][col];
	                }
	            }
	            if (max == min)
	            {
	            	this.check=true;
	            	if(min==kq ) continue;
	            	 kq=min;
	                output+= kq+" ";
	                
	            }
	        }
	    }
		return output;
	}
	
}
