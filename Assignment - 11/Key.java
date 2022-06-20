package lessong11assignment;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key key = (Key) obj;
		if (this.firstName.equals(key.firstName) && this.lastName.equals(key.lastName)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int result = 19;
		int fNameHash = firstName.hashCode();
		int lNameHash = lastName.hashCode();
		return result + fNameHash + lNameHash;
	}
}
