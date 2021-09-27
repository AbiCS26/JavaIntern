package readcalculator;

import getinputs.Inputs;

public class AverageSpeed {
	AverageFactory AF = new AverageFactory();

	public static void main(String args[]) {
		int category = Inputs.getCategoryFromUser();
		AverageSpeed a = new AverageSpeed();
		System.out.println(a.printAverage(350, category));
	}

	public String printAverage(int count, int category) {
		AverageSpeedInterface avgSpeed = AF.getObjectForCategory(category);
		return avgSpeed.getAverage(count);
	}
}
