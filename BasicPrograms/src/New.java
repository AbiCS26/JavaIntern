import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		System.out.println("Enter the number of *");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = i; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
