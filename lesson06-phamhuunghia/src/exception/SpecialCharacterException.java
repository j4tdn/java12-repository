package exception;

public class SpecialCharacterException extends InvalidLengthException{
	public SpecialCharacterException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
