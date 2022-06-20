package lab9;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		return -1;

	}

	public void enqueue(int obj) {
		if (rear == 0 && front == -1) {
			front++;
		}
		if (rear == size()) {
			resize();
		}

		arr[rear] = obj;

		rear++;

	}

	public int dequeue() {
		if (isEmpty())
			return -1;

		int frontElement = arr[front];

		int[] tempArray = new int[arr.length];
		System.arraycopy(arr, 1, tempArray, 0, arr.length - 1);
		arr = tempArray;
		--rear;

		if (rear == 0)
			front = -1;

		return frontElement;
	}

	public boolean isEmpty() {
		return (rear == 0 && front == -1);
	}

	public int size() {
		return arr.length;
	}

	private void resize() {
		if (arr == null || arr.length == 0)
			return;
		int newLength = 2 * arr.length;
		arr = Arrays.copyOf(arr, newLength);
	}

	public static void main(String[] args) {
		ArrayQueueImpl arrque = new ArrayQueueImpl();
		System.out.println(Arrays.toString(arrque.arr));
		System.out.println("front: " + arrque.front);
		System.out.println("rear: " + arrque.rear);
		System.out.println("size: " + arrque.size());
		System.out.println("is empty: " + arrque.isEmpty());
		arrque.enqueue(10);
		arrque.enqueue(20);
		arrque.enqueue(30);
		arrque.enqueue(40);
		arrque.enqueue(50);
		arrque.enqueue(60);
		arrque.enqueue(70);
		System.out.println(Arrays.toString(arrque.arr));
		System.out.println("front: " + arrque.front);
		System.out.println("rear: " + arrque.rear);
		System.out.println("size: " + arrque.size());
		System.out.println("is empty: " + arrque.isEmpty());
		System.out.println("dequed item : " + arrque.dequeue());
		System.out.println("dequed item : " + arrque.dequeue());

		System.out.println(Arrays.toString(arrque.arr));
		System.out.println("front: " + arrque.front);
		System.out.println("rear: " + arrque.rear);
		System.out.println("size: " + arrque.size());
		System.out.println("is empty: " + arrque.isEmpty());
		arrque.dequeue();
		System.out.println(Arrays.toString(arrque.arr));
		System.out.println("front: " + arrque.front);
		System.out.println("rear: " + arrque.rear);
		System.out.println("size: " + arrque.size());
		System.out.println("is empty: " + arrque.isEmpty());

	}
}
