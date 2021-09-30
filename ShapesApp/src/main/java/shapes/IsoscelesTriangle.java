package shapes;

public class IsoscelesTriangle implements Shapes {

	public String getShape(int x) {
		String s = "";
		for (int i = 1; i <= x; i++) {
			for (int j = i; j < x; j++) {
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
