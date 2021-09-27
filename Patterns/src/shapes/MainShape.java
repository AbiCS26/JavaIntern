package shapes;

import userinputs.Inputs;

public class MainShape extends Inputs {

	public static void main(String[] args) {
		ShapeFactory SF = new ShapeFactory();
		int s;
		do {
			s = getShapeNumberFromUser();

			int r = getRowsFromUser(s);

			if (s == 5) {
				int c = getColumnsFromUser(s);
				printRectangle(SF, s, r, c);
			} else
				printShapes(SF, s, r);

		} while (userNotDone(s));
	}

}
