package shapes;

public class MisSelectionException extends RuntimeException {
	public MisSelectionException() {
		System.out.println("SELECT A SHAPE BETWEEN 1-5\n");
	}
}
