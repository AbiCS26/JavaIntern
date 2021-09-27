package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		stk.pop();
		for (Integer s : stk) {
			System.out.println(s);
		}
		System.out.println("Elements in Stack: " + stk);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Berry");
		fruits.remove("Apple");
		fruits.remove(1);
		System.out.println("After Deleting Elements: " + fruits);

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Delhi");
		linkedList.add("NewYork");
		linkedList.add("Moscow");
		linkedList.remove("Moscow");
		linkedList.remove(1);
		System.out.println("After Deleting Elements: " + linkedList);

		Queue<Integer> q = new LinkedList<>();
		q.offer(5);
		q.offer(6);
		q.offer(7);
		System.out.println(q.poll());

		HashSet<String> hs = new HashSet<String>();
		hs.add("Mohan");
		hs.add("Rohan");
		hs.add("Sohan");
		hs.add("Mohan");
		hs.remove("Mohan");
		System.out.println("After removing elements: \n" + hs);

		LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
		hs1.add(100);
		hs1.add(200);
		hs1.add(300);
		hs1.add(100);
		System.out.println(hs1);
		hs1.remove(300);
		System.out.println("After removing: \n" + hs1);

		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.remove("Ravi");
		System.out.println("After Removing: " + al);

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		System.out.println(hm);

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a", 100);
		tm.put("c", 200);
		tm.put("c", 300);
		tm.put("d", 400);
		tm.put("b", 400);
		for (Map.Entry<String, Integer> s : tm.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}
		System.out.println(tm);

	}

}
