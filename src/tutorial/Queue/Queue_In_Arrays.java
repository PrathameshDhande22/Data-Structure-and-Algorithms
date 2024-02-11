package tutorial.Queue;

import java.util.Arrays;

public class Queue_In_Arrays {

	/**
	 * Queue Data Structure Implementation using Arrays.</br>
	 * 
	 * <b>Note : </b> for operation of dequeue in array it takes O(n) to remove the
	 * element.
	 */
	class Queue {
		/**
		 * Array for storing the elements.
		 */
		private int arr[];
		/**
		 * Variable to allocated the size for the array.
		 */
		private int size;
		/**
		 * Keeps track of the rear part.
		 */
		private int rear;

		/**
		 * Queue Constructor to initialize the array size.
		 * 
		 * @param n size of the array or size of the queue.
		 */
		public Queue(int n) {
			this.size = n;
			this.arr = new int[n];
			this.rear = -1;
		}

		/**
		 * Checking if the queue is Empty or not using the {@code rear} variable.
		 * 
		 * @return true if empty otherwise false.
		 */
		public boolean isEmpty() {
			return this.rear == -1;
		}

		/**
		 * Adds the element into the queue or in short adding the data in the queue.
		 * 
		 * @param data to be added in the queue.
		 */
		public void enqueue(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is Full");
				return;
			}
			arr[++rear] = data;
		}

		/**
		 * Removes the data from the front of the queue.
		 * 
		 * This function takes the O(n) time to delete from front.
		 * 
		 * @return Deleted Element from the Queue otherwise -1 if there are no elements.
		 */
		public int dequeue() {
			if (this.isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;
		}

		/**
		 * Element in the front of the queue.
		 * 
		 * @return front element.
		 */
		public int peek() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[0];
		}

		/**
		 * Traversing the Array
		 */
		public void traverse() {
			System.out.println(Arrays.toString(this.arr));
		}
	}

	public static void main(String[] args) {
		Queue_In_Arrays qq = new Queue_In_Arrays();
		Queue q = qq.new Queue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}

	}

}
