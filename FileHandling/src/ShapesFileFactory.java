
public class ShapesFileFactory {

	public Shapes getObjectForShapes(int number) {
		if (number == 0)
			System.out.println("Select correct shape");
		else if (number == 1)
			return new RightAngle();

		else if (number == 2)
			return new Isosceles();

		return null;
	}

}
