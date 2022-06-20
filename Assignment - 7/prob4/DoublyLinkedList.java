package linkedlist.prob4;

public class DoublyLinkedList {

	Node header;

	DoublyLinkedList() {
		header = new Node();
	}

	// adds to the end of the list
	public void addLast(String item) {
		if (item == null)
			return;

		Node newNode = new Node();
		newNode.value = item;
		newNode.next = null;

		for (Node node = header; node != null; node = node.next) {
			if (node.next == null) {
				node.next = newNode;
				newNode.previous = node;
				break;
			}
		}

	}

	public boolean remove(String item) {

		if (item == null)
			return false;
		Node node;

		for (node = header; node != null; node = node.next) {
			if (node.value != null) {
				if (node.value.equals(item)) {
					// retrieving previous node
					Node prevNode = node.previous;
					// retrieving next node
					Node nextNode = node.next;

					prevNode.next = nextNode;
					nextNode.previous = prevNode;
					return true;
					// break;
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Binod");
		list.addLast("Steve");
		list.addLast("Dinesh");
		System.out.println(list);

		System.out.println("Removing items : Binod\n");
		list.remove("Binod");

		System.out.println(list);
	}
}
