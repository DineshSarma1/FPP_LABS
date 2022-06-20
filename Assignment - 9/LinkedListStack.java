package lab9;

public class LinkedListStack implements Stack1 {
	Node header;
	int top;

	LinkedListStack() {
		top = -1;
		header = new Node();
	}

	@Override
	public void push(Object ob) {
		if (ob == null)
			return;

		Node newNode = new Node();
		newNode.value = ob;
		newNode.next = null;

		for (Node node = header; node != null; node = node.next) {
			if (node.next == null) {
				node.next = newNode;
				newNode.previous = node;
				++top;
				break;
			}
		}

	}

	@Override
	public Object pop() {

		if (isEmpty())
			return null;

		Object tempObj = null;
		for (Node node = header; node != null; node = node.next) {
			if (node.next == null) {
				tempObj = node.value;
				Node prevNode = node.previous;
				prevNode.next = null;

				--top;
			}
		}

		return tempObj;
	}

	@Override
	public Object peek() {
		if (isEmpty())
			return null;

		Object tempObj = null;
		for (Node node = header; node != null; node = node.next) {
			if (node.next == null) {
				tempObj = node.value;
			}
		}

		return tempObj;
	}

	@Override
	public boolean isEmpty() {

		return (top == -1);
	}

	@Override
	public int size() {

		int size = top + 1;
		return size;
	}

	public static final void main(String[] a) {
		LinkedListStack linkedListStack = new LinkedListStack();
		linkedListStack.push("Dinesh");
		linkedListStack.push("Nirmal");
		linkedListStack.push("Binod");
		linkedListStack.push("Luzan");
		linkedListStack.push("Aanand");
		linkedListStack.push("Rajendra");

		System.out.println(linkedListStack.size());

		System.out.println(linkedListStack.pop());
		System.out.println(linkedListStack.pop());
		System.out.println(linkedListStack.pop());
		linkedListStack.push("Temporary");
		System.out.println(linkedListStack.size());
		System.out.println(linkedListStack.peek());
	}

	class Node {
		Object value;
		Node next;
		Node previous;

		Node() {
			this.previous = null;
			this.value = null;
			this.next = null;
		}

		public String toString() {
			return value == null ? "null" : value.toString();
		}

	}
}
