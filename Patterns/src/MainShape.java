import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		ShapeFactory SF = new ShapeFactory();
		Scanner in = new Scanner(System.in);
		int shapeno, rows = 0;
		do {
			System.out.println(
					"Select a shape to be printed \n1.Diamond \n2.Isosceles Triangle \n3.Right Angle \n4.Right Angle Mirrored \n5.Rectangle \nPress any other number to EXIT");
			shapeno = in.nextInt();

			if (shapeno > 0 && shapeno < 6) {
				System.out.println("\nEnter number of rows");
				rows = in.nextInt();
			}

			if (shapeno == 5) {
				System.out.println("\nEnter number of columns");
				int columns = in.nextInt();
				try {
					Shapes rectangle = SF.getObjectForShapes(shapeno);
					System.out.println(rectangle.getShape(rows, columns));
				} catch (IllegalArgumentException e) {
					System.out.println("2 Arguments required for this Shape\n");
				}
			}

			else {
				try {
					Shapes shape = SF.getObjectForShapes(shapeno);
					System.out.println(shape.getShape(rows));

				} catch (IllegalArgumentException e) {
					System.out.println("1 Argument is enough for this Shape");
				} catch (NullPointerException e) {
					System.out.println("Select shape between 1-5\n");
				} finally {
					System.out.println("Exited");
				}
			}
		} while (shapeno > 0 && shapeno < 6);
		in.close();
	}
}
