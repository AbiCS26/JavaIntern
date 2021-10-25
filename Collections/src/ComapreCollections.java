import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

		HashMap<String, Integer> tm = new HashMap<>();
		tm.put("a", 100);
		tm.put("c", 200);
		tm.put("c", 300);
		tm.put("d", 400);
		tm.put("b", 400);

		System.out.println(tm.remove("a"));
		System.out.println(tm.remove("a"));

	}

}
