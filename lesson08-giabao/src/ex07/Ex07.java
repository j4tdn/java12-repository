package ex07;

public class Ex07 {
	public static void main(String[] args) {
		String str = "aaabaaabbaaaaa";

		int maxSubStringLength = 0;
		int minSubStringLength = str.length();
		int maxSubStringIndex = 0;
		int minSubStringIndex = 0;
		int index = 0;
		int count = 1;

		for (index = 1; index < str.length(); index++) {
			if (str.charAt(index) != str.charAt(index - 1)) {
				if(maxSubStringLength < count ) {
					maxSubStringLength = count;
					maxSubStringIndex = index - count;
				}
				if(minSubStringLength > count ) {
					minSubStringLength = count;
					minSubStringIndex = index - count;
				}
				count = 1;
			} else {
				count++;
			}
		}
		if(maxSubStringLength < count ) {
			maxSubStringLength = count;
			maxSubStringIndex = index - count;
		}
		if(minSubStringLength > count ) {
			minSubStringLength = count;
			minSubStringIndex = index - count;
		}	
		
		System.out.printf("%d %s [%d]\n", maxSubStringLength , str.substring(maxSubStringIndex, maxSubStringIndex + maxSubStringLength) , maxSubStringIndex);
		System.out.printf("%d %s [%d]", minSubStringLength , str.substring(minSubStringIndex, minSubStringIndex + minSubStringLength) , minSubStringIndex);	
	}
}
