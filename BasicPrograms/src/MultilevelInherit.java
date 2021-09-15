
class One1 {
	public void printOne() {
		System.out.println("Superclass");
	}
}

class Two2 extends One1 {
	public void printTwo() {
		System.out.println("childclass1");
	}
}

class Three extends Two2 {
	public void printThree() {
		System.out.println("childclass2");
	}
}

public class MultilevelInherit {
	public static void main(String[] args) {
		Three g = new Three();
		g.printThree();
		g.printOne();
		g.printOne();
	}
}
