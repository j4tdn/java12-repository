package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// Immutable

		String s = "Box";
		System.out.println(System.identityHashCode(s));
		s += "Layout";
		System.out.println(System.identityHashCode(s));

		s = s.concat("Layout");
		System.out.println(System.identityHashCode(s));

		System.out.println(s);
		// Khi cộng cuỗi nhiều lần thì sẽ sinh ra nhiều ô nhớ mới => đây là hạn chế của
		// Immutable

		System.out.println("=============");
		// Mutable: String builder, String buffer
		StringBuilder b = new StringBuilder("Grid");
		System.out.println(System.identityHashCode(b));
		b.append("-Layout").append("-Manager");
		System.out.println(System.identityHashCode(b));
		System.out.println("b: " + b);
		
		System.out.println("========Dao chuoi ko dung thu vien======");
		System.out.println(reverse("abcde efghj"));
	}

	private static String reverse(String input) {
		char[] sequence= input.toCharArray();
		for (int i = 0; i < input.length() / 2; i++) {
			char tmp=sequence[i];
			sequence[i]=sequence[sequence.length-i-1];
			sequence[sequence.length-i-1] = tmp;
		}
		return String.copyValueOf(sequence);
	}
}
