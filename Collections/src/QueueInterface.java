import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String args[]) {
		PriorityQueue<Integer> s = new PriorityQueue<>();
		Queue<Integer> s1 = new LinkedList<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s.add(i);
		long end = System.currentTimeMillis();
		long res = end - start;
		System.out.println("Queue : " + res);

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			s1.add(i);
		long end1 = System.currentTimeMillis();
		long res1 = end1 - start1;
		System.out.println("LinkedListQueue : " + res1);
	}
}
