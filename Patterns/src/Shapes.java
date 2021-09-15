
public interface Shapes {
	default String getShape(int x) {
		throw new IllegalArgumentException("This shape must have 2 arguments");
	};

	default String getShape(int x, int y) {
		throw new IllegalArgumentException("1 Argument is enough for this shape");
	};

}
