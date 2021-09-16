package sample;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[1] = 2;
			a[4] = 30 / 2;

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		} finally {
			System.out.println("hi");
		}
		System.out.println("hello");
	}
}
