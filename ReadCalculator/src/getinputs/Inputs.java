package getinputs;

import java.util.Scanner;

public class Inputs {
	private static Scanner sc = new Scanner(System.in);

	public static int getCategoryFromUser() {
		System.out
				.println("Select a category to estimate reading time:\n1.Kids \n2.Average Person \n3.Professionals \n");
		int no = sc.nextInt();
		return no;
	}

}
