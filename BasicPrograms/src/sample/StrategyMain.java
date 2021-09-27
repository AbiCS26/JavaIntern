package sample;

public class StrategyMain {

	public static void main(String[] args) {
		Context c = new Context(new Addition());
		System.out.println("5 + 2 = " + c.executeStrategy(5, 2));

		c = new Context(new Subtraction());
		System.out.println("5 - 2 = " + c.executeStrategy(5, 2));

		c = new Context(new Multiplication());
		System.out.println("5 * 2 = " + c.executeStrategy(5, 2));
	}
}
