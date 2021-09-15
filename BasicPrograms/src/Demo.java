import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		
		if(x<17)
			System.out.println("not eligible");
		else if(x>17 && x<60)
			System.out.println("eligible");
		else if(x>59)
			System.out.println("seniors are eligible");
	}

}
