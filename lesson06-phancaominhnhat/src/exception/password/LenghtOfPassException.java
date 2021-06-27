package exception.password;

public class LenghtOfPassException extends Exception{

	/**
	 * Check lenght of password
	 */
	private static final long serialVersionUID = -4207194287743244129L;
	
	public LenghtOfPassException(String message) {
		super(message);
	}
}
