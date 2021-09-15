public class CompiletimePolymorphism {
	void show() {
		System.out.print("sum of ");
	}

	void sum(int a, int b) {
		show();
		System.out.println(a + " + " + b + " " + "= " + (a + b));
	}

	void sum(int a, int b, int c) {
		show();
		System.out.println(a + " + " + b + " + " + c + " " + "= " + (a + b + c));
	}

	void sum(int a, int b, int c, int d, int e) {
		show();
		System.out.println(a + " + " + b + " + " + c + " + " + d + " + " + e + " = " +(a + b + c + d + e));
	}

	void sum(int a, int b, int c, int d) {
		show();
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + (a + b + c + d));
	}

	public static void main(String args[]) {
		CompiletimePolymorphism obj = new CompiletimePolymorphism();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);
		obj.sum(10, 10, 10, 50, 60);
		obj.sum(10, 10, 10, 50);

	}
}