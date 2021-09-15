interface intfA {
	void compareTo(String s, String s1);
}

interface intfB {
	void contains(String s, String s1);
}

class Sample implements intfA, intfB {
	public void compareTo(String s, String s1) {
		System.out.println(s.compareTo(s1));
	}

	public void contains(String s, String s1) {
		System.out.println(s.contains(s1));
	}
}

public class Interface {
	public static void main(String[] args) {
		String s = "Abl";
		String s1 = "Abi";
		Sample ob1 = new Sample();

		ob1.compareTo(s, s1);
		ob1.contains(s, s1);
	}
}
