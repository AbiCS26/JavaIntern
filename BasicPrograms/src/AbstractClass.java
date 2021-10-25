
abstract class Animal {
	String name = " ";

	public abstract void sound();

	public void sleep() {

		System.out.println(name + " is sleeping");
	}
}

class Dog extends Animal {

	public void sound() {
		System.out.println("Barks");
	}
}

public class AbstractClass {
	public static void main(String args) {
		Dog obj = new Dog();
		obj.sound();
		obj.name = "Dog";
		obj.sleep();
	}
}