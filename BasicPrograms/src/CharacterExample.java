
public class CharacterExample {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		char ch3 = 'A';
		System.out.println(ch1 == ch2);
		System.out.println(ch1 < ch2);
		System.out.println(ch3 == ch1);

		Character ch4 = 'X';
		Character ch5 = 'B';
		Character ch6 = 'X';
		System.out.println(Character.compare(ch5, ch6));
		System.out.println(Character.compare(ch4, ch6));
		System.out.println(Character.compare(ch4, ch5));

		System.out.println(ch5.equals(ch2));
		System.out.println(ch6.equals(ch3));
		System.out.println(ch2 == ch5);
		
	}

}
