package BT1;

import java.util.Arrays;

public class BT1 {
	private static void getStudent(String[] Students) {
		for (int i=1; i < Students.length; i++)
        {
            if(Students[i].toUpperCase().contains("A"))
            {
            	  System.out.println( Students[i] + "  ");
            }
            else if(Students[i].toUpperCase().contains("F")){
            	 System.out.print( Students[i] + "  ");
            }
        }   
	}
	public static void main(String[] args) {
		String[] Students = 
		{
		"102-Nam-C",
		"104-Hoàng-D",
		"109-Lan-A",
		"103-Bảo-F",
		"105-Nguyên-B",
		"107-Vũ-F",
		"103-Bảo-F",
		"202-Đạt-C",
		"107-Vũ-C",
		"193-Bảo-B",
		"104-Hoàng-B",
		};  
		
        getStudent(Students);
     
	}
}