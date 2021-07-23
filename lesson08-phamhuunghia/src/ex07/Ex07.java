package ex07;

public class Ex07 {
	public static void main(String[] args) {

		String name = "aaaabbaa";
		System.out.println("Chuoi ban dau: " + name);
		getMaxLength(name);
		getMinLength(name);
	}

	private static void getMaxLength(String strInput) {
		int max = 0;
		String strMax = "";
		int indexTemp = 0;
		int realIndex = 0;
		StringBuilder str = new StringBuilder();

		// Đưa chuỗi về dạng aaa-bbbb-aaaaa-cc
		for (int i = 0; i < strInput.length(); i++) {
			if (i == 0) {
				str.append(strInput.charAt(i));
				continue;
			}
			if (strInput.charAt(i) == strInput.charAt(i - 1)) {
				str.append(strInput.charAt(i));
			} else {
				str.append("-" + strInput.charAt(i));
			}
		}

		String[] arr = str.toString().split("-");
		int i = 0;
		
		
		for (String s : arr) {
			if (s.length() > max) {
				max = s.length();
				strMax = s;
				indexTemp = i;
			}
			i++;
		}

		for (i = 0; i < indexTemp; i++) {
			realIndex += arr[i].length();
		}

		print(strMax, realIndex);
	}

	private static void getMinLength(String strInput) {
		int minLength = getMin(strInput);
		StringBuilder str = new StringBuilder();
		int realIndex = 0;
		String strMin = "";
		for (int i = minLength; i < strInput.length(); i++) {
			if (i == minLength) {
				str.append(strInput.charAt(i));
				continue;
			}
			if (strInput.charAt(i) == strInput.charAt(i - 1)) {
				str.append(strInput.charAt(i));
			} else {
				str.append("-" + strInput.charAt(i));
			}
		}

		String[] arr = str.toString().split("-");
		int i = 1;
		int indexTemp = 0;
		for (String s : arr) {
			if (s.length() < minLength) {
				strMin = s;
				minLength = s.length();
				indexTemp = i;
			}
			i++;
		}
		if (indexTemp > 0) {
			realIndex += minLength;
		}
		for (i = 0; i < indexTemp; i++) {
			realIndex += arr[i].length();
		}

		print(strMin, realIndex);

	}

	/*
	 * lấy độ dài của "dãy còn đúng" ở đầu chuỗi 
	 * -input: aabbbbaaaaa 
	 * -output:2
	 */
	static int getMin(String s) {
		int MinLength = 1;
		int index = 0;
		do {
			if (index == s.length() - 1 || s.charAt(index) != s.charAt(index + 1)) {
				return MinLength;
			}
			if (s.charAt(index) == s.charAt(index + 1)) {
				MinLength++;
				index++;
			}

		} while (true);
	}

	private static void print(String s, int index) {
		System.out.println("Độ dài lớn nhất của dãy con đúng : " + s.length() + "- '" + s + "' - [" + index + "]");
	}
}
