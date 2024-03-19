package tutorial.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_in_JCF {
	public static void main(String[] args) {
		// creating the object of the queue interface too Linked Class.
		Queue<Integer> q = new LinkedList<Integer>();

		// Adding the data into the Queue
		q.add(1);
		q.add(2);
		q.add(3);

		// Traversing through the queue and poping the element from the queue.
		while (!q.isEmpty()) {
			System.out.print(q.peek() + " - ");
			q.remove();
		}

	}
}
