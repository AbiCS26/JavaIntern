class Studentss {
	private String name;
	private int no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	
}

public class EncapsExample {
	public static void main(String[] args) {
		Studentss s = new Studentss();
		s.setName("surya");
		System.out.println(s.getName());
		s.setNo(1);
		System.out.println(s.getNo());
	}
}