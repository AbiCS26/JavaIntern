class one {
	public void printone() {
		System.out.println("baseclass");
	}
}

class two extends one {
	public void printtwo() {
		System.out.println("childclass");
	}
}

public class SingleInher {
	public static void main(String[] args) {
		two g = new two();
		g.printtwo();
		g.printone();
		g.printtwo();
	}
}
