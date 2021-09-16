package sample;

class Person {

	private String firstName;
	private String lastName;

	public void setFirstName(String n) {
		firstName = capitalizeFirstLetter(n);
	}

	public String getFirstName() {

		return firstName;
	}

	private String capitalizeFirstLetter(String n) {
		if (n.length() < 10) {
			if (n.charAt(0) != (n.toUpperCase()).charAt(0)) {
				String a = n.substring(0, 1);
				return a.toUpperCase() + n.substring(1);
			}
		} else
			throw new StringSizeTooLongException();
		return n;

	}

}

public class Main {
	public static void main(String args[]) {

		Person james = new Person();
		Person abi = new Person();
		try {
			abi.setFirstName("abilashjjjj");
		} catch (StringSizeTooLongException e) {
			System.out.println("String size must be less than 10");
		}
		System.out.println(abi.getFirstName());
	}
}
