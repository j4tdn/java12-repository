package ex03;

public class EmailException extends Exception{
	public EmailException(String message) {
		System.out.println(message);
	}
}
