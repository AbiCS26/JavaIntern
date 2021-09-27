package shapes;

public class Rectangle implements Shapes {

	public String getShape(int x, int y) {
		String s = "";
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				s += "*";
			}
			s += "\n";
		}
		return s;

	}
}
