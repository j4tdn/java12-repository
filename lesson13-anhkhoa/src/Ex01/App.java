package Ex01;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class App {
	private static String[] files = { "image", "music", "system", "coding" };
	private static String dir = "garbage";

	public static void main(String[] args) throws IOException {
		// FileUtils.createDirectory(files, dir);
		// FileUtils.create(dir, 20, Extension.values());
		File dirFile = new File(dir);
		File[] files = dirFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				String name = pathname.getName();
				if (name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".jpeg"))
					return true;
				return false;
			}
		});
		File[] files2 = dirFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				String name = pathname.getName();
				if (name.endsWith(".mp3") || name.endsWith(".mp4"))
					return true;
				return false;
			}
		});
		File[] files3 = dirFile.listFiles(a -> a.getName().endsWith(".bat"));
		File[] files4 = dirFile.listFiles(a -> a.getName().endsWith(".java"));
		File[] files5 = dirFile.listFiles(a -> a.getName().endsWith(".txt"));
		// FileUtils.MoveFile("image", files);
		// FileUtils.MoveFile("C:\\Users\\Asus\\OneDrive\\Desktop\\University\\Java\\hoc
		// them\\Java12\\workspace\\lesson13-anhkhoa\\garbage\\music", files2);
//		FileUtils.MoveFile(
//				"C:\\Users\\Asus\\OneDrive\\Desktop\\University\\Java\\hoc them\\Java12\\workspace\\lesson13-anhkhoa\\garbage\\system",
//				files3);
//		FileUtils.Copy(files4,
//				"C:\\Users\\Asus\\OneDrive\\Desktop\\University\\Java\\hoc them\\Java12\\workspace\\lesson13-anhkhoa\\garbage\\coding");
		// FileUtils.Dele(files5);
	}
}
