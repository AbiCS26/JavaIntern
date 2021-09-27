import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> s = new HashMap<>();
		Map<Integer, String> s1 = new Hashtable<>();
		Map<Integer, String> s2 = new TreeMap<>();
		Map<Integer, String> s3 = new LinkedHashMap<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s.put(i, "s");
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("HashMap : " + res);

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s1.put(i, "s");
		long end1 = System.currentTimeMillis();
		long res1 = end1 - start1;
		System.out.println("Hashtable : " + res1);

		long start4 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s2.put(i, "s");
		long end4 = System.currentTimeMillis();
		long res4 = end4 - start4;
		System.out.println("TreeMap : " + res4);

		long start5 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s3.put(i, "s");
		long end5 = System.currentTimeMillis();
		long res5 = end5 - start5;
		System.out.println("LinkedHashMap : " + res5);
	}

}
