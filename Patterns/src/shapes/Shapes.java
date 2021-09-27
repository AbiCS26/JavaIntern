package shapes;

public interface Shapes {
	default String getShape(int x) {
		throw new IllegalArgumentException();
	};

	default String getShape(int x, int y) {
		throw new IllegalArgumentException();
	};

}
