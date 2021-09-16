package sample;

public class Subtraction implements Strategy {

	@Override
	public int doCalculation(int x, int y) {
		return x - y;
	}

}
