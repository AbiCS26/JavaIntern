public class Capacity {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer();

		System.out.println("capacity = " + str.capacity());

		str.ensureCapacity(17);

		System.out.println("capacity = " + str.capacity());
	}
}
