package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		input = convert(input);
		System.out.println("output: " + input);
	}
	public static String convert(String input) {
	    input = input.replaceAll("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ", "a");
	    input = input.replaceAll("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ", "e");
	    input = input.replaceAll("ì|í|ị|ỉ|ĩ", "i");
	    input = input.replaceAll("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ", "o");
	    input = input.replaceAll("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ", "u");
	    input = input.replaceAll("ỳ|ý|ỵ|ỷ|ỹ", "y");
	    input = input.replaceAll("đ", "d");

	    input = input.replaceAll("À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ", "A");
	    input = input.replaceAll("È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ", "E");
	    input = input.replaceAll("Ì|Í|Ị|Ỉ|Ĩ", "I");
	    input = input.replaceAll("Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ", "O");
	    input = input.replaceAll("Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ", "U");
	    input = input.replaceAll("Ỳ|Ý|Ỵ|Ỷ|Ỹ", "Y");
	    input = input.replaceAll("Đ", "D");
	    return input;
	}
}
