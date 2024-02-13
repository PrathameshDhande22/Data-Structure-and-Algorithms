package tutorial.Queue;

public class Circular_Queue_Implementation {

	/**
	 * Circular Queue Implementation using Arrays which Takes O(1) to dequeue the
	 * element.
	 */
	class CircularQueue {
		/**
		 * Array to store the queue elements.
		 */
		int arr[];
		/**
		 * Queue Size
		 */
		int size;
		/**
		 * points to front of the queue
		 */
		int front;
		/**
		 * Points to rear of the queue
		 */
		int rear;

		/**
		 * Constructor of Circular Queue
		 * 
		 * @param n size of the Queue.
		 */
		public CircularQueue(int n) {
			this.size = n;
			this.arr = new int[n];
			this.front = -1;
			this.rear = -1;
		}

		/**
		 * Checks if the Circular Queue is Empty or not
		 * 
		 * @return true if empty otherwise false.
		 */
		public boolean isEmpty() {
			return rear == -1;
		}

		/**
		 * Checks if the Circular Queue is Full or not.
		 * 
		 * @return true if full otherwise false.
		 */
		public boolean isFull() {
			return (rear + 1) % size == front;
		}

		/**
		 * Enqueue or add the data to the queue and also updates the rear.
		 * 
		 * @param data to add it in the queue.
		 */
		public void enqueue(int data) {
			if (isFull()) {
				System.out.println("Queue is Full");
				return;
			}
			rear = (rear + 1) % size;
			if (front == -1) {
				front = 0;
			}
			arr[rear] = data;
		}

		/**
		 * To remove the element from the Queue pointing to the front.
		 * 
		 * @return removed element from the Circular Queue.
		 */
		public int dequeue() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int result = arr[front];

			// to delete the last element
			if (rear == front) {
				rear = front = -1;
			} else {
				front = (front + 1) % size;
			}
			return result;
		}

		/**
		 * Front element from the Circular Queue
		 * 
		 * @return Front element in the queue.
		 */
		public int peek() {
			if (isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String[] args) {
		Circular_Queue_Implementation ccq = new Circular_Queue_Implementation();
		CircularQueue cq = ccq.new CircularQueue(3);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		System.out.println(cq.dequeue());
		cq.enqueue(4);

		while (!cq.isEmpty()) {
			System.out.println(cq.dequeue());
		}

	}

}
