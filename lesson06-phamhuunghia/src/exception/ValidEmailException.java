package exception;

public class ValidEmailException extends InvalidLengthException{
	public ValidEmailException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
