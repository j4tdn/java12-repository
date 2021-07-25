package baitap5;


public class Main {
	private static String s1 = "ABCEDEABC";
	private static String s2 = "ABCEDCBBCK";
	
	public static void main(String[] args) {
		String smallerString = s1.length() > s2.length() ? s2 : s1;
		String biggerString = s1.length() > s2.length() ? s1 : s2;
		String[] arr = new String[s1.length()];
		int count = 0;
		int temp = 0;
		for(int i = 0; i < smallerString.length(); i++) {
			if(biggerString.contains(smallerString.substring(temp, i + 1))){
				arr[count] = smallerString.substring(temp, i + 1);
				continue;
			} else {
				count++;
				temp = i + 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
