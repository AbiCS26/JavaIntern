import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		ShapeFactory SF = new ShapeFactory();
		Scanner in = new Scanner(System.in);
		System.out.println(
				"Select a shape to be printed \n1.Diamond \n2.Isosceles Triangle \n3.Right Angle \n4.Right Angle Mirrored \n5.Rectangle\n");
		int shapeno = in.nextInt();
		System.out.println("\nEnter number of rows");
		int rows = in.nextInt();
		int c = 2;
		if (shapeno == 5) {
			Shapes rectangle = SF.getObjectForShapes(shapeno);
			System.out.println(rectangle.getShape(rows));
		}

		Shapes shape = SF.getObjectForShapes(shapeno);
		try {
			System.out.println(shape.getShape(rows, c));
		} catch (IllegalArgumentException e) {
			System.out.println("This shape must have 2 arguments");
		}

		in.close();
	}
}
