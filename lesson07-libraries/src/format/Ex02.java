package format;
import java.text.DecimalFormat;


/**
 * 
 * format number do người dùng tự định nghĩa
 *
 */
public class Ex02 {
	private static String Pattern="#,###.000";
	private static String Pattern2="#,###.###";
	//#,### : cứ 3 số thì nó sẽ tự động đánh dấu ,
	//.000  : chỉ lấy 3 số thập phân, nếu phần thập phân ko có đủ 3 chữ số thì nó 
	//        se tự thêm số 0
	
	public static void main(String[] args) {
		double digit= 223111134568.2722d;
		DecimalFormat df=new DecimalFormat(Pattern);
		System.out.println("df: "+df.format(digit));
	}
}
