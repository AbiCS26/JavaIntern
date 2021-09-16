package sample;

class Singleton {

	private static Singleton instance;
	public String s;

	private Singleton() {
		s = "hello";
	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}
