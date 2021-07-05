package Ex04;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int s = Integer.parseInt(sc.nextLine());
		String results = "";
		String[] number = { "không", " một", " hai", " ba", " bốn", " năm", " sáu", " bảy", " tám", " chín" };
		String[] number1 = { "", " mốt", " hai", " ba", " bốn", " năm", " sáu", " bảy", " tám", " chín" };
		if (s > 0 && s < 10) {
			results = number[s];
		}
		else if (s < 100) {
			if (s == 10) {
				results = "mười";
			} 
			else if(s>10&&s<20)
			{
				results+= " mười"+number[s-10*(s/10)];
			}
			else {
				results = number[s / 10] + " mươi" + number1[s - (10 * (s / 10))];
			}
		}
		else if (s < 1000) {
			int x = s - (100 * (s / 100));
			if (s % 100 == 0) {
				results = number[s / 100] + " trăm";
			} else {
				results = number[s / 100] + " trăm";
				if (x < 10) {
					results += " lẻ" + number[x];
				}
				if(x%10!=0&&x>10&&x<20)
				{
					results+= " mười"+number[x-10*(x/10)];
				}
				else if (x % 10 != 0 && x > 19) {
					results += number[x / 10] + " mươi" + number1[x - (10 * (x / 10))];
				} else if(x%10==0&&x>9){
					if (x == 10) {
						results += " mười";
					} else {
						results += number[x / 10] + " mươi";
					}
				}
			}
		}
		System.out.println(results);
	}
}
