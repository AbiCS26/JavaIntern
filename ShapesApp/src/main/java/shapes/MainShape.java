package shapes;

import java.io.PrintWriter;

import userinputs.Inputs;

public class MainShape extends Inputs {

	public static void mainShape(int s, int r, int c, PrintWriter out) {
		ShapeFactory SF = new ShapeFactory();

		if (s == 5) {
			printRectangle(SF, s, r, c, out);
		} else
			printShapes(SF, s, r, out);
	}

	public static void printRectangle(ShapeFactory SF, int shapeno, int r, int c, PrintWriter out) {
		try {
			Shapes rectangle = SF.getObjectForShapes(shapeno);
			out.println(rectangle.getShape(r, c));
		} catch (IllegalArgumentException e) {
			out.println("2 Arguments required for this Shape\n");
		}
	}

	public static void printShapes(ShapeFactory SF, int shapeno, int r, PrintWriter out) {
		try {
			Shapes shape = SF.getObjectForShapes(shapeno);
			out.println(shape.getShape(r));

		} catch (MisSelectionException e) {
			out.println("SELECT A SHAPE BETWEEN 1-5");
		} catch (IllegalArgumentException e) {
			out.println("1 Argument is enough for this Shape\n");
		}
	}

}
