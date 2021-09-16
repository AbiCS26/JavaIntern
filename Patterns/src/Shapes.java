
public interface Shapes {
	default String getShape(int x) {
		throw new IllegalArgumentException("2 Arguments needed for this Shape");
	};

	default String getShape(int x, int y) {
		throw new IllegalArgumentException();
	};

}
