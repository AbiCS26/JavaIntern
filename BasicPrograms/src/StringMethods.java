public class StringMethods {
	public static void main(String[] args) {

		String s = "Hello";
		System.out.println("String: " + s);

		int length = s.length();
		System.out.println("Length: " + length);

		String second = "Programming";
		System.out.println("Second String: " + second);
		
		StringBuilder s1 = new StringBuilder(second);
		s1.append(" language");
		System.out.println(s1);

		String joinedString = second.concat(second);
		System.out.println("Joined String: " + joinedString);
		second.concat("james");
		System.out.println(second);
		
		if (second.equals(s)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	} 
}