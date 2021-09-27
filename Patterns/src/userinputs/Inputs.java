package userinputs;

import java.util.InputMismatchException;
import java.util.Scanner;

import shapes.ShapeFactory;
import shapes.Shapes;

public class Inputs {

	private static Scanner sc;

	protected static boolean userNotDone(int s) {
		return (s != 6) ? true : false;
	}

	protected static int getShapeNumberFromUser() {
		sc = new Scanner(System.in);

		int shapeno = 100;
		System.out.println(
				"Select a shape to be printed \n1.Diamond \n2.Isosceles Triangle \n3.Right Angle \n4.Right Angle Mirrored \n5.Rectangle \n6.EXIT");
		try {
			shapeno = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("DON'T ENTER OTHER CHARACTERS!\n");
		}
		return shapeno;
	}

	protected static int getRowsFromUser(int s) {
		sc = new Scanner(System.in);

		int rows = 0;
		if (s > 0 && s < 6) {
			System.out.println("\nEnter number of rows");
			rows = sc.nextInt();
		}
		return rows;
	}

	protected static int getColumnsFromUser(int shapeno) {
		sc = new Scanner(System.in);

		int columns = 0;
		System.out.println("\nEnter number of columns");
		columns = sc.nextInt();
		return columns;
	}

	protected static void printRectangle(ShapeFactory SF, int shapeno, int r, int c) {
		try {
			Shapes rectangle = SF.getObjectForShapes(shapeno);
			System.out.println(rectangle.getShape(r, c));
		} catch (IllegalArgumentException e) {
			System.out.println("2 Arguments required for this Shape\n");
		}
	}

	public static void printShapes(ShapeFactory SF, int shapeno, int r) {
		try {
			Shapes shape = SF.getObjectForShapes(shapeno);
			System.out.println(shape.getShape(r));

		} catch (IllegalArgumentException e) {
			System.out.println("1 Argument is enough for this Shape\n");
		}
	}
}
