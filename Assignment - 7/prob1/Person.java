package arraylist.prob1;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String first, String last, int a) {
		// constructor
		this.lastName = last;
		this.firstName = first;
		this.age = a;
	}

	// --------------------------------------------------------------
	public String getLast() {
		// get last name
		return lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + age;
	}
	// end class Person
}
