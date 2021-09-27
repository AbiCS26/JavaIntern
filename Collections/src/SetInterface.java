import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String args[]) {

		Set<Integer> s = new HashSet<>();
		Set<Integer> s1 = new TreeSet<>();
		Set<Integer> s2 = new LinkedHashSet<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s.add(i);
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("HashSet : " + res);

		long start1 = System.currentTimeMillis();
		for (int i = 1000000; i < 0; i--)
			s1.add(i);
		long end1 = System.currentTimeMillis();
		long res1 = end1 - start1;
		System.out.println("TreeSet : " + res1);

		long start4 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s2.add(i);
		long end4 = System.currentTimeMillis();
		long res4 = end4 - start4;
		System.out.println("LinkedHashSet : " + res4);
	}
}