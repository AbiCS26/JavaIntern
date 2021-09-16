package sample;

public class Multiplication implements Strategy {

	@Override
	public int doCalculation(int x, int y) {
		return x * y;
	}

}
