package shapes;

public class RightAngle implements Shapes {

	public String getShape(int x) {
		String s = "";
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < i; j++) {
				s += "*";
			}
			s += "\n";
		}
		return s;

	}
}