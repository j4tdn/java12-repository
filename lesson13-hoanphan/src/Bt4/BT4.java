package Bt4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import fileUtils.FileUtils;

public class BT4 {
	private static String path = "D:\\java12\\workspaces\\lesson13-hoanphan\\src\\Bt4\\readme.txt";
	private static Random rd = new Random() ;
	public static void main(String[] args) throws IOException {
	    int m, n;
	    try (Scanner scanner = new Scanner(System.in)) {
			do {
			    System.out.println("Nhập vào số dòng của ma trận:");
			    m = scanner.nextInt();
			    System.out.println("Nhập vào số cột của ma trận:");
			    n = scanner.nextInt();
			} while (m < 1 || n < 1);
		}
	         
	    int A[][] = new int[m][n];
	           
	    System.out.println("Ma trận A vừa nhập:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	        	A[i][j] = rd.nextInt(10);
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	    
	    try (
                PrintStream output = new PrintStream(new File(path));) {
	    	   String s= "rows:"+m+" || cols: "+n +"\n";
	    	   output.println(s);
            for (int i = 0; i < A.length; i++) {
             
                String s1 = "";
                for (int j = 0; j < A[i].length; j++) {
                    s1+= " " + A[i][j] + " ";
                }
                output.println(s1);
            }
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	        System.out.println("=========End========");
		File fileo = new File(path);
		FileUtils.open(fileo);
		
		
		FileUtils.read(fileo);
	        
	}

}