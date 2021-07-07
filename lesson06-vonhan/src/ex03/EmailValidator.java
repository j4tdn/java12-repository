package ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private static String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

	private static Pattern pattern = null;
	private static Matcher matcher = null;

	public static boolean validateWithString(String email) throws EmailException{
		if(!(email.indexOf("@") == email.lastIndexOf("@"))) {
				throw new EmailException("Email address must have only one @ character !");
		}
		
		if(!email.contains("@")) {
			throw new EmailException("Email address must have @ character ");
		}
		return true;
	}

	public static boolean validateWithRegex(String email) throws EmailException{
		pattern = Pattern.compile(EMAIL_REGEX);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
