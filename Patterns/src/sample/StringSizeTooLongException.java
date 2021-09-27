package sample;

public class StringSizeTooLongException extends RuntimeException {
	public StringSizeTooLongException() {
		super("String Size must be less than 10");
	}
}
