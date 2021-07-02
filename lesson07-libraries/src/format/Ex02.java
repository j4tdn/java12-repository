package format;



import java.text.DecimalFormat;

public class Ex02 {
	private static String Pattern="#,###.0000000";
	// # 0 , .
	
	public static void main(String[] args) {
		double digit= 11134568.27d;
		DecimalFormat df=new DecimalFormat(Pattern);
		System.out.println("df: "+df.format(digit));
	}
}
