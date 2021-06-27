package exception;

public class UppercaseAlphaException extends InvalidLengthException {
	public UppercaseAlphaException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
}
