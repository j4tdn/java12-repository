package exception;

public class InvalidNumberInputException extends InvalidLengthException {

	public InvalidNumberInputException(String msg) {
		super(msg);
		this.msg = msg;
	}

}
