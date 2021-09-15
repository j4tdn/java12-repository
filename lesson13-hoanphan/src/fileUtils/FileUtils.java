package fileUtils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.Extension;
import common.ExtensionImg;
import common.FileHandler;

public class FileUtils {
	private static final Random rd = new Random();
	
	private FileUtils() {
		
	}
	public static <E extends FileHandler> void writeLines(Path path, List<E> list, OpenOption option) {
		
		List<String> lines = list.stream()
							.map(E::toLine)
							.collect(Collectors.toList());
		try {
			Files.write(path,lines,option);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Write file successfull");
	}
	public static void read(File file) {
		//read file >> draft
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//iterator
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(br,fr);
		}
	}
	
	public static <E> List<E> readLines(Path path, Function<String, E> func) {
		try {
			List<String> lines = Files.readAllLines(path);
			return lines.stream().map(func)
					.collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	public static <T> List<T> readObject(File file){
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			return safeList(ois.readObject());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Collections.emptyList();
	}
	@SuppressWarnings("unchecked")
	private static <T> List<T> safeList(Object o){
		return(List<T>) o;
	}
	
	public static void write(File file) {
		//write file >> draft
		//write file
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.write("Transaction: ALan - Milan 25000\n");;
			bw.write("Trader: Kyler >> Cambridge 100000\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(bw,fw);
		}
		
		System.out.println("=========End========");
		FileUtils.open(file);
	}
	
	public static void writeObject(File file, Object o) {
		FileOutputStream fos= null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static File create(String path) {
		boolean isValid = false;
		File file = new File(path);
		if(!file.exists()) {
			File parent = file.getParentFile();
			if(!parent.exists()) {
				parent.mkdirs();
			}
			isValid = createFile(file);
		}
			return isValid ? file : null;
	}
	
	private static boolean createFile(File file) {
		boolean isValid = false;
		try {
			isValid = file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isValid;
	}
	public static boolean[] create(String dirPath, int nof, Extension[] exts) {
		boolean[] result = new boolean[nof];
		File dirFile = new File(dirPath);
		if(!dirFile.exists()) {
			dirFile.mkdirs();
		}
		
		int length = exts.length;
		for(int i = 0; i < nof; i++) {
			String name = "" + System.currentTimeMillis() + exts[rd.nextInt(length)].val();
			File file= new File(dirFile, name);
			result[i] = createFile(file);
		}
		return result;
		
		
	}
	public static boolean[] createImg(String dirPath, int nof, ExtensionImg[] exts) {
		boolean[] result = new boolean[nof];
		File dirFile = new File(dirPath);
		if(!dirFile.exists()) {
			dirFile.mkdirs();
		}
		
		int length = exts.length;
		for(int i = 0; i < nof; i++) {
			String name = "" + System.currentTimeMillis() + exts[rd.nextInt(length)].val();
			File file= new File(dirFile, name);
			result[i] = createFile(file);
		}
		return result;
		
		
	}
	public static void printf(File ...files ) {
		for(File file : files) {
			System.out.println(file.getPath());
		}
		
	}
	
	public static File[] filter(String path,String ex ) {
		File dirFile = new File(path);
		
		File[] files =  dirFile.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(Extension.valueOf(ex).val());
			}
		});
		return files;
		
		
	}
	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(AutoCloseable ...closeables ) {
		for(AutoCloseable closeable: closeables) {
			if(closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void deleteFiles(String folder, String ext) {
        File dir = new File(folder);
 
        // list out all the file name with .txt extension
        File[] list = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(Extension.valueOf(ext).val());
			}
		});
        // delete files
        if (list.length != 0) {
            for (File file : list) {
                boolean isdeleted = file.delete();
                System.out.println("file : " + file + " is deleted : " + isdeleted);
            }
        }
    }
	public static void moveFiles(String folder,String des, String ext) {
        File dir = new File(folder);
 
        File[] list = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(Extension.valueOf(ext).val());
			}
		});
        
        // move files
        if (list.length != 0) {
            for (File file : list) {
            	boolean isMoved = file.renameTo(new File(des+file.getName()));
                System.out.println("file : " + file + " is moved : " + isMoved);
                } 
        }
    }
	
	public static void copyFiles(String folder,String des, String ext) {
        File dir = new File(folder);
 
        File[] list = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(Extension.valueOf(ext).val());
			}
		});
        
        // copy files
        if (list.length != 0) {
            for (File file : list) {
            	 try {
					Files.copy(file.toPath(),
						        (new File(des + file.getName())).toPath(),
						        StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                } 
        }
    }
	static int i = 0;
	public static void renameFiles(String folder, String ext) {
        File dir = new File(folder);
        File[] list = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				
				return file.isFile() && file.getName().endsWith(Extension.valueOf(ext).val());
			}
		});
        
       
        if (list.length != 0) {
        	  for (i = 0; i < list.length; i++) {
        		
                  if (list[i].isFile()) {

                      File f = new File(folder +list[i].getName()); 

                      f.renameTo(new File(folder+i+"."+ext));
                  }
                 
              }
              System.out.println("conversion is done");
          }
      }
	
}