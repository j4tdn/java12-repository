package Bt3;

import java.io.File;
import java.util.Scanner;

import fileUtils.FileUtils;

public class Bt3 {
	private static String input = "D:\\java12\\workspaces\\lesson13-hoanphan\\src\\Bt3\\input.txt";
	private static String output = "D:\\java12\\workspaces\\lesson13-hoanphan\\src\\Bt3\\output.txt";

	
	public static void main(String[] args) {
//		  String str1 =  "ab52c2d4ef18s";
//	      System.out.println("The given string is: "+str1);
//	      SeparateDigits(str1);
		File file = new File(input);
		FileUtils.read(file);
		
//		System.out.println(s);
//		SeparateDigits(s);
	
	}
	public static void SeparateDigits(String stng) 
	{
		  stng = stng.replaceAll("[^0-9,-\\.]", ",");
		  String[] item = stng.split(",");
		for (int i = 0; i < item.length; i++) {
		try {
			Double.parseDouble(item[i]);
			System.out.println(item[i]);
		} catch (NumberFormatException e) {}
		}
	  }
	}



