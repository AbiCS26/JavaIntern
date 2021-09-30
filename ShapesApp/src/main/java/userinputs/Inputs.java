package userinputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {

	private static Scanner sc;

	public static boolean userNotDone(int s) {
		return (s != 6) ? true : false;
	}

	public static int getShapeNumberFromUser() {
		sc = new Scanner(System.in);
		int shapeno = 100;
		try {
			shapeno = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("DON'T ENTER OTHER CHARACTERS!\n");
		}
		return shapeno;
	}

	public static int getRowsFromUser(int s) {
		sc = new Scanner(System.in);
		int rows = 0;
		if (s > 0 && s < 6) {
			System.out.println("\nEnter number of rows");
			rows = sc.nextInt();
		}
		return rows;
	}

	public static int getColumnsFromUser(int shapeno) {
		sc = new Scanner(System.in);

		int columns = 0;
		System.out.println("\nEnter number of columns");
		columns = sc.nextInt();
		return columns;
	}

}
