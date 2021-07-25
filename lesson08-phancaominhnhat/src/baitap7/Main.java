package baitap7;


public class Main {

	public static void main(String[] args) {
	    String str = "aaabbaaabbbaaaaa";
	    String max = "";
	    int posMax = 0;
	    String min = str;
	    int posMin = 0;
	    String[] arr = new String[str.length()];
	    
		int count = 0;
		int tmp = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.length() - 1 == i) {
				arr[count] = str.substring(tmp, i + 1);
				continue;
			}
			if(str.charAt(i) == str.charAt(i + 1)) {
				arr[count] = str.substring(tmp, i + 1);
				continue;
			}
			if(str.charAt(i) != str.charAt(i + 1)) {
				//aaabbaaabbbaa
				arr[count] = str.substring(tmp, i + 1);
					count++;
				tmp = i + 1;
				continue;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(max.length() < arr[i].length()) {
				max = arr[i];
				posMax = str.indexOf(max);
			}
			if(min.length() >= arr[i].length()) {
				min = arr[i];
				posMin = str.indexOf(min);
			}
		}
		
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + max.length() + " \"" + max + "\"" + " [" + posMax + "]");
		System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + min.length() + " \"" + min + "\"" + " [" + posMin + "]");
    }
}
