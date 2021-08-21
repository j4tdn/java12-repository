package demo;

public class Leet {
	public static void main(String[] args) {
		String[] strs = {"ab","a"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String newStr = "";
		int length = Integer.MAX_VALUE;
		for(int i = 0; i < strs.length; i++) {
			if(length > strs[i].length()) {
				length = strs[i].length();
			}
		}
		for(int i = 0; i < length; i++) {
			for (int j = 0; j < strs.length - 1; j++) {
				if(strs[j].charAt(i) != strs[j + 1].charAt(i)) {
					return newStr;
				}
			}
			newStr = strs[0].substring(0, i + 1);
		}
		
		
		return newStr;
    }
}
