package ex02;


public class Ex02 {
	static int[] input = {10,14,21,3,1,25,15,35,70};
	public static void main(String[] args) {
		int[] output = new int[input.length];
		int head=0;
		int tail=output.length-1;

		//5 vè cuối dãy
		//7 về đầu dãy
		for( int i : input) {
			if((i%5!=0)&&(i%7==0)) {
				output[head++]=i;
			} else {
				if((i%5==0)&&(i%7!=0)){
					output[tail--]=i;
				} 
			}
		}
		for( int i: input) {
			if(i%35==0) {
				output[head++]=i;
			}
		}
		for(int i: input) {
			if(!isExist(i, output)) {
				output[head++]=i;
			}
		}
		for(int i: output) {
			System.out.print(i + " ");
		}
	}
	private static boolean isExist(int value, int[] output) {
		for( int i :output) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}
	
}
