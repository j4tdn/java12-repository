package ex03;

public class EmailException extends Exception{
	private String message;
	
	public EmailException() {
	}
	
	public EmailException(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "EmailException : " + message;
	}
	
}
