package lessong11assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> temp = new HashMap<>();
		if (students == null)
			return null;

		for (Student s : students) {
			Key key = new Key(s.getFirstName(), s.getLastName());
			temp.put(key, s);
		}
		return temp;
	}

	public static double computeAverageGPA(HashMap<Key, Student> maps) {
		double totalGPA = 0.0;
		int count = 0;
		Set<Entry<Key, Student>> entrySet = maps.entrySet();

		for (Entry<Key, Student> e : entrySet) {
			totalGPA = totalGPA + e.getValue().getGpa();
			count++;

		}

		return (totalGPA / count);
	}
}
