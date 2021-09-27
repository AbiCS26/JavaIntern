import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	public static void main(String args[]) {
		ArrayList<Integer> s = new ArrayList<>();
		LinkedList<Integer> s1 = new LinkedList<>();
		Vector<Integer> s2 = new Vector<>();
		Stack<Integer> s3 = new Stack<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s.add(i);
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("ArrayList : " + res);

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s1.add(i);
		long end1 = System.currentTimeMillis();
		long res1 = end1 - start1;
		System.out.println("LinkedList : " + res1);

		long start4 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s2.add(i);
		long end4 = System.currentTimeMillis();
		long res4 = end4 - start4;
		System.out.println("Vector : " + res4);

		long start5 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s3.push(i);
		long end5 = System.currentTimeMillis();
		long res5 = end5 - start5;
		System.out.println("Stack : " + res5);

		long start2 = System.currentTimeMillis();
		s.add(2, 5);
		s.remove(3);
		long end2 = System.currentTimeMillis();
		long res2 = end2 - start2;
		System.out.println(res2);

		long start3 = System.currentTimeMillis();
		s1.add(2, 5);
		s1.remove(3);
		long end3 = System.currentTimeMillis();
		long res3 = end3 - start3;
		System.out.println(res3);

	}

}
