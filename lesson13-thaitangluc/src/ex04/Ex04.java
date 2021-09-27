package ex04;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import utils.FileUtils;

public class Ex04 {
	private static final Scanner ip = new Scanner(System.in);
	private static final Random rd = new Random();
	private static final String README = "readme.txt";

	public static void main(String[] args) {
		System.out.println("nhap n va m: ");
		int n = ip.nextInt();
		int m = ip.nextInt();
		int[][] a = new int[100][100];
		
		File file = FileUtils.create(README);
		FileUtils.write(file, n + " ");
		FileUtils.write(file, m + "\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = rd.nextInt(10);
				System.out.println(a[i][j]);
				FileUtils.write(file, a[i][j] + " ");
			}
			FileUtils.write(file, "\n");
		}
	}
}
