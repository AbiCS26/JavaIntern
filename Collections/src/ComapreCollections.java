import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class ComapreCollections {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();
		listA.add("k");
		listA.add("c");
		listA.add("b");

		listA.add("d");

		HashSet<String> listB = new HashSet<>();
		listB.add("k");
		listB.add("c");
		listB.add("b");
		listB.add("d");

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a", 100);
		tm.put("c", 200);
		tm.put("c", 300);
		tm.put("d", 400);
		tm.put("b", 400);

		System.out.println(Collections.max(listB));
		for (Map.Entry<String, Integer> t : tm.entrySet()) {
			if (listA.contains(t.getKey())) {
				System.out.println("The value is: " + t.getValue());
			}
		}
		System.out.println(listA.containsAll(tm.keySet()));
	}

}
