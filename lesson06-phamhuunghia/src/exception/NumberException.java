package exception;

public class NumberException extends InvalidLengthException {
	public NumberException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
