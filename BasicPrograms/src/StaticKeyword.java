class Student {
	String name;
	int no;
	String school = "abc";

	void show() {
		System.out.println(name + " " + no + " " + school);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "abi";
		s.no = 1;
		s.school = "abc";

		s.show();

		Student s1 = new Student();
		s1.name = "hari";
		s1.no = 2;
		s1.school = "aaa";

		s1.show();
		s.show();
	}

}
