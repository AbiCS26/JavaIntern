import java.util.Scanner;

public class ShapesFile {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Select a shape to be written in a file \n1.Right Angle \n2.Isosceles Triangle \n");
		int shapeno = in.nextInt();
		System.out.println("\nEnter number of rows");
		int rows = in.nextInt();
		in.close();

		ShapesFileFactory SFF = new ShapesFileFactory();
		Shapes shape = SFF.getObjectForShapes(shapeno);
		String result = shape.getShape(rows);

		FileOperations fo = new FileOperations();
		fo.createFile();

		fo.writeFile(result);

		fo.readFile();

		System.out.println(result);

	}
}
