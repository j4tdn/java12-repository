package baitap5;


public class Main {
	private static String s1 = "ABCEDEABC";
	private static String s2 = "ABCEDCBBCK";
	
	public static void main(String[] args) {
		String smallerString = s1.length() > s2.length() ? s2 : s1;
		String biggerString = s1.length() > s2.length() ? s1 : s2;
		
		String[] arrCommon = new String[smallerString.length()/2];
		int countElement = 0;
		int count = 0;
		for(int i = 0; i < smallerString.length() - 1; i++) {
			int end = 0;
			for(int j = 0; j < biggerString.length(); j++) {
				System.out.println(i + " " + j);
				if(smallerString.charAt(i) == biggerString.charAt(j)) {
					count++;
					i++;
					end = j;
					if(i == smallerString.length()) {
						break;
					}
				}
			}
			if(count > 1) {
				countElement++;
				System.out.println(end);
				System.out.println(count);
				arrCommon[countElement] = biggerString.substring(end + 1 - count, end + 1);
			}
		}
		
		for(int i = 0; i < arrCommon.length - 1; i++) {
			System.out.println(arrCommon[i]);
		}
	}
}
