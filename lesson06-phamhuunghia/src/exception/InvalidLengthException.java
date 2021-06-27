package exception;

public class InvalidLengthException extends Exception {
	
	public InvalidLengthException(String msg) {
		super(msg);
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "- " +msg;
	}
	String msg;
}
