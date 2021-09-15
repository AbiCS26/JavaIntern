
public class BuilderBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hi");
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			sb.append("hello");
		}

		long end = System.currentTimeMillis();

		long res = end - start;
		System.out.println(res);

		StringBuffer sb1 = new StringBuffer("hi");
		long start1 = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			sb1.append("hello");
		}

		long end1 = System.currentTimeMillis();

		long res1 = end1 - start1;
		System.out.println(res1);

	}

}
