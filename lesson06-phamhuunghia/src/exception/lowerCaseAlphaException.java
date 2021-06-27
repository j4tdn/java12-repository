package exception;

public class lowerCaseAlphaException extends InvalidLengthException{
	public lowerCaseAlphaException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
}
