package Ex02;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		String[] string = { "01a2b3456cde478", "aa6b326c6e22h" };
		for (Integer item : printf(string)) {
			System.out.println(item);
		}
	}

	private static List<Integer> printf(String... ids) {
		List<Integer> rs = new ArrayList<Integer>();
		for (String id : ids) {
			String[] temp = id.split("\\D+");
			Integer max = 0;
			if(temp[0]=="")
			{
				max = Integer.parseInt(temp[1]);
			}
			else
			{
				max = Integer.parseInt(temp[0]);
			}
			for (int i = 1; i < temp.length; i++) {
				Integer check = Integer.parseInt(temp[i]);
				if (check >= max)
					max = check;
				if (i == temp.length - 1)
					rs.add(max);
			}
		}
		return rs;
	}
}
