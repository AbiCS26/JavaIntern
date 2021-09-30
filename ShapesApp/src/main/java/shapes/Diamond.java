package shapes;
public class Diamond implements Shapes {

	public String getShape(int x) {
		IsoscelesTriangle it = new IsoscelesTriangle();
		String s = it.getShape(x);

		for (int i = x - 1; i >= 1; i--) {
			for (int j = x; j > i; j--) {
				s += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				s += "*";
			}
			s += "\n";
		}

		return s;
	}

}
