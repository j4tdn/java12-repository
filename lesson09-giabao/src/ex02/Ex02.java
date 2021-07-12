package ex02;

public class Ex02 {
	static int n=4;
	static String[] input = {"aa6b546c6e22h", "aa6b326c6e22h","abc",""};
	static int[] output = new int[n];
	public static void main(String[] args) {
		for(int i=0;i<input.length;i++){
		String[] numbers = input[i].split("\\D+");
		output[i]=getLargestNumbers(numbers);
		}
		sortOuput();
		for(int i: output) {
			System.out.print(i+ " ");
		}
	}
	private static void sortOuput() {
		for(int i =0;i<output.length;i++) {
			for(int j =0;j<i;j++) {
				if(output[i]<output[j]) {
					int tmp = output[j];
					output[j] = output[i];
					output[i]=tmp;
			}
			}
		}
	}
	private static int getLargestNumbers(String ...ss) {
		int rs=0;
		if(ss.length==1) return rs;
		for(int i=0;i<ss.length;i++) {
			if (ss[i]!="") {
				rs=max(rs, Integer.parseInt(ss[i]));
			}
		}
		return rs;
	}
	private static int max(int a, int b) {
		return a>b?a:b;
	}
}
