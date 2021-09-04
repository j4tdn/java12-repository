package utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Random;

import common.Extensions;

public class FileUtils {
	private static final Random rd=new Random();
	public FileUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void read(File file) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println(br.readLine());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileUtils.close(br,fr);
		}
	}
	
	public static void write(File file) {
		// write file
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(bw);

			bw.write("Transaction: Alan - Milan -25000\n");
			bw.write("Trader: Kyler - Cambridge - 10000\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(bw, fw);
		}
		System.out.println("================");
		FileUtils.open(file);
	}
	public static File create(String path) {
		boolean isValid=false;
		File file=new File(path);
		if(!file.exists()) {
			File parent=file.getParentFile();
			if(!parent.exists()) {
				parent.mkdirs();
			}
			isValid = createFile(file);
		}
		return isValid?file:null;
	}

	private static boolean createFile(File file) {
		boolean isValid=false;
		try {
			isValid=file.createNewFile();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return isValid;
	}
	public static void printf(File...files) {
		for(File file: files) {
			System.out.println(file.getPath());
		}
	}
	public static boolean[] create(String dirPath,int nof,Extensions[] ex) {
		boolean[] result=new boolean[nof];
		
		File dirFile=new File(dirPath);
		
		if(!dirFile.exists()) {
			dirFile.mkdirs();
		}
		int length=ex.length;
		
		for(int i=0;i< nof;i++) {
			String name=""+System.currentTimeMillis()+ex[rd.nextInt(length)];
			File file=new File(name);
			result[i]=createFile(file);
		}
		return result;
	}
	public static void close(AutoCloseable...closebales) {
		for(AutoCloseable closebale:closebales ) {
			if(closebale!=null) {
				try {
					closebale.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
