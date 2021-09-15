import java.util.Scanner;
public class Front22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()>2)
			System.out.println(s.substring(0,2) + s + s.substring(0,2));
		else if(s.length()<3)
			System.out.println(s + s + s);
	

	}

}
