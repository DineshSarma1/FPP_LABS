package arraylist.prob1;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] personArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room
	// else call resize()
	public void add(Person person) {
		if (person == null)
			return;
		if (size == personArray.length)
			resize();
		personArray[size++] = person;
	}

	// 2. get person information by passing index
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return personArray[i];
	}

	// 3. Find the Person object using last name
	public boolean find(String lastName) {
		if (lastName == null)
			return false;
		for (Person p : personArray) {
			if (p != null) {
				if (p.getLast().equalsIgnoreCase(lastName)) {
					return true;
				}
			}
		}
		return false;
	}

	// 4. Remove the person object by passing its last name
	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		if (lastName == null)
			return false;

		int index = -1;
		for (int i = 0; i < size; i++) {
			if (personArray[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] tempPerson = new Person[personArray.length];
		System.arraycopy(personArray, 0, tempPerson, 0, index);
		System.arraycopy(personArray, index + 1, tempPerson, index, personArray.length - (index + 1));

		personArray = tempPerson;
		--size;

		return true;
	}

	// 5. Resizing the list
	private void resize() {
		int len = personArray.length;
		int newLen = len * 2;
		Person[] newPerson = new Person[newLen];
		System.arraycopy(personArray, 0, newPerson, 0, len);
		personArray = newPerson;

	}

	// To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArray[i] + ", \n");
		}
		sb.append(personArray[size - 1] + "]");
		return sb.toString();
	}

	// Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Renuka", "Mohanraj", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		// System.out.println("removed item : " + list.remove("Mohanraj"));
		list.remove("Mohanraj");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		// list.insert(new Person("Arun", "Jetlie", 32), 2);
		System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
		System.out.println(list.get(2));
	}
}