package sample;

public class SingletonDemo {
	public static void main(String args[]) {

		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		x.s = (x.s).toUpperCase();
		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

	}
}
