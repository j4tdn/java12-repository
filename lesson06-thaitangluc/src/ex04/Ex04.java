package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so: ");
		String number = ip.next();
		System.out.println(readNumber(number));

	}

	public static String readNumber(String number) {
		String read = "";
		
		if(number.length()==3) {
			if(number.charAt(1) == '0' && number.charAt(2) == '0') read+=readHundered(number.charAt(0));
			else read+=readHundered(number.charAt(0)) + readDozen(false, number.charAt(1)) + readUnit(false, number.charAt(2)); 
		}
		
		if(number.length()==2) {
			if(number.charAt(1) == '0') read+=readDozen(true, number.charAt(0));
			else read+=readDozen(false, number.charAt(0)) + readUnit(false, number.charAt(1)); 
		}
		
		if(number.length()==1) {
			read+=readUnit(true, number.charAt(0));
		}
		return read;
	}	

	public static String readHundered(char c) {
		switch (c) {
		case '1': {
			return "Một trăm ";
		}
		case '2': {
			return "Hai trăm ";
		}
		case '3': {
			return "Ba trăm ";
		}
		case '4': {
			return "Bốn trăm ";
		}
		case '5': {
			return "Năm trăm ";
		}
		case '6': {
			return "Sáu trăm ";
		}
		case '7': {
			return "Bảy trăm ";
		}
		case '8': {
			return "Tám trăm ";
		}
		case '9': {
			return "Chín trăm ";
		}
		}
		return ""; 
	}

	public static String readDozen(boolean check, char c) {
		
		switch (c) {
		case '0':{
			return "linh ";
		}
		case '1': {
			return check ? "Mười " : "mười ";
		}
		case '2': {
			return check ? "Hai mươi " : "hai mươi ";
		}
		case '3': {
			return check ? "Ba mươi " : "ba mươi ";
		}
		case '4': {
			
			return check ? "Bốn mươi " : "bốn mươi ";
		}
		case '5': {
			return check ? "Năm mươi " : "năm mươi ";
		}
		case '6': {
			return check ? "Sáu mươi " : "sáu mươi ";
		}
		case '7': {
			return check ? "Bảy mươi " : "bảy mươi ";
		}
		case '8': {
			return check ? "Tám mươi " : "tám mươi ";
		}
		case '9': {
			return check ? "Chín mươi " : "chín mươi ";
		}
		}
		return "";
	}
	
	public static String readUnit(boolean check, char number) {

		switch (number) {
		case '0': {
			return "Không";
		}
		case '1': {
			return check ? "Một" : "một";
		}
		case '2': {
			return check ? "Hai" : "hai";
		}
		case '3': {
			return check ? "Ba" : "ba";
		}
		case '4': {
			return check ? "Bốn" : "bốn";
		}
		case '5': {
			return check ? "Năm" : "năm";
		}
		case '6': {
			return check ? "Sáu" : "sáu";
		}
		case '7': {
			return check ? "Bảy" : "bảy";
		}
		case '8': {
			return check ? "Tám" : "tám";
		}
		case '9': {
			return check ? "Chín" : "chín";
		}
		}
		return "";
	}

}
