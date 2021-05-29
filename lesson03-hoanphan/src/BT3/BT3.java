package BT3;

import java.util.Random;
import java.util.Scanner;

public class BT3 {
	public static Scanner scanner = new Scanner(System.in);
	public static int[][] arr;
	public static int sh;
	public static int sc;
	public static Random rd = new Random();
	public static void main(String[] args) {
			System.out.print("Nhập số hàng: ");
			sh = Integer.parseInt(scanner.nextLine());
			System.out.print("Nhập số cột: ");
			sc = Integer.parseInt(scanner.nextLine());
			arr = new int[sh][sc];
			input();
			output();
			YenNgua(arr);
	
	}
	public static void input() {
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}
	}
	
	public static void output() {
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.printf("%-4d",arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void YenNgua(int arr[][]) {
		  int minhang[] = new int[10];
	        int maxcot[] = new int[10];
	        for (int i=0; i<sh; i++) {
	            minhang[i] = arr[i][0];
	            for(int j=0; j<sc; j++) {
	                if (minhang[i] > arr[i][j]) {
	                    minhang[i] = arr[i][j];
	                }
	            }
	        }

	        for (int j=0; j<sc; j++) {
	            maxcot[j] = arr[0][j];
	            for(int i=0; i<sh; i++) {
	                if (maxcot[j] < arr[i][j]) {
	                    maxcot[j] = arr[i][j];
	                }	                
	            }
	        }

	        for (int i=0; i<sh; i++) {
	            for (int j=0; j<sc; j++) {
	                if((arr[i][j] == minhang[i]) && (arr[i][j] == maxcot[j])) {
	                    System.out.println("Yen ngua = " +arr[i][j]);
	                }  
	            }
	
	        }   
	}
}
