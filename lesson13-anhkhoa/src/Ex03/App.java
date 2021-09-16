package Ex03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import utils.FileUtils;

public class App {
	private static String input = "Bai3//input.txt";
	private static String output = "Bai3//output.txt";

	public static void main(String[] args) {
		List<String> in = FileUtils.read(new File(input));
		List<String> rs = new ArrayList<>();
		List<Integer> rss = new ArrayList<>();
		for (var item : in) {
			if (item.length() > 1) {
				String[] gr = item.trim().split("[a-zA-Z]");
				for (var itemm : gr) {
					if (itemm != "" && itemm != "0")
						rs.add(itemm);
				}
			}
		}
		for (var item : rs) {
			rss.add(Integer.parseInt(item));
		}
		rss.sort((o1, o2) -> o1 - o2);
		rs.clear();
		for (var item : rss) {
			rs.add(item.toString());
		}
		FileUtils.write(new File(output), rs);

	}
}
