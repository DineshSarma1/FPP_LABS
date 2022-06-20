package inclassdemo;

import java.util.Comparator;
// Task A
public class FnameComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getFname().compareTo(o2.getFname());
		//o1.getFname().compareToIgnoreCase(o2.getFname());  // Ignore a case
	}
}
