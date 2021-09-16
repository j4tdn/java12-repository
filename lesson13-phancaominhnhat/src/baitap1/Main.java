package baitap1;
import static baitap1.Utils.*;

import extension.Extension;


public class Main {
	private static String[] fileImage = {Extension.png.value(), Extension.jpg.value(), Extension.jpeg.value()};
	private static String[] fileMusic = {Extension.mp3.value(), Extension.mp4.value()};
	private static String fileSystem = Extension.bat.value();
	private static String fileCoding = Extension.java.value();
	
	public static void main(String[] args) {
		create();
		System.out.println(action(DirEnum.image.toString(), OptionEnum.move.toString(),fileImage));
		System.out.println(action(DirEnum.music.toString(), OptionEnum.move.toString(), fileMusic));
		System.out.println(action(DirEnum.system.toString(), OptionEnum.move.toString(), fileSystem));
		System.out.println(action(DirEnum.coding.toString(), OptionEnum.copy.toString(), fileCoding));
		System.out.println(action(null, OptionEnum.delete.toString(),Extension.txt.value()));
	}
}
