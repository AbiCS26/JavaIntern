package sample;

public class Addition implements Strategy {

	@Override
	public int doCalculation(int x, int y) {
		return x + y;
	}

}
