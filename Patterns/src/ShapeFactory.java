
public class ShapeFactory {
	public Shapes getObjectForShapes(int number) {
		if (number == 0)
			System.out.println("Enter correct value");
		else if (number == 1)
			return new Diamond();

		else if (number == 2)
			return new IsoscelesTriangle();

		else if (number == 3)
			return new RightAngle();

		else if (number == 4)
			return new RightAngleMirrored();

		else if (number == 5)
			return new Rectangle();

		return null;
	}
}
