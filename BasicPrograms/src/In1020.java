import java.util.Scanner;

public class In1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(calculate(a,b))
			System.out.println("true");
		else
			System.out.println("false");
		

	}
public static boolean calculate(int a,int b) {
	if((a>=10 && a<21) || (b<9 && b<21))
		return true;
	else
		return false;
}

}
