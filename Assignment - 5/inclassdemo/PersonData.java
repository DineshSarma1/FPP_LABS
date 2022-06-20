package inclassdemo;

import java.util.Arrays;
import java.util.Comparator;

/** Processes person data. Makes use of an external NameComparator class */
public class PersonData {
	
	public static void main(String[] args) {
		Person[] persons = prepareData();
		Person[] persons1 = prepareData1();
		PersonData obj = new PersonData();
		// Task A : Outside Comparator
	/*	FnameComparator com = new FnameComparator();
		Arrays.sort(persons, com);
		System.out.println("Sort by First name using outside comparator");
		for(Person p: persons) {
			System.out.println(p);
		}*/
		
		// Task B: Comparator using Member Inner class
		/*
		Arrays.sort(persons, obj.getComparator());
		System.out.println("Sort by last name using Member Innerclass comparator");
		for(Person p: persons) {
			System.out.println(p);
		}*/
		// Task C: Local Inner class
	//	 obj.mySort(persons);
		// Task D	 - Anonymous Inner class
		
	/*	Arrays.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.getLname().compareTo(o1.getLname());
			}
			
		});
		System.out.println("Anonymous impletation using last name reversed order");
		for(Person p: persons) {
			System.out.println(p);
		}*/
		// Task E: Lambda Implementation - Salary natural order
		Arrays.sort(persons1,(p1,p2) -> Double.compare(p1.getSalary(), p2.getSalary()));
		System.out.println("Anonymous impletation using last name reversed order");
		for(Person p: persons1) {
			System.out.println(p);
			System.out.println(p.getSalary());
		}
		
	}
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown"), new Person("Bob","Roth"), 
			 new Person("Anne","Mary"), new Person("Tim","Cook"),
			 new Person("Rosy","Cook")};
		return persons;
	}
	
	public static Person[] prepareData1() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	// Task B
	private class LnameComparator implements Comparator<Person>{
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getLname().compareTo(o2.getLname());
		}
		
	}
	// Task B
	 private LnameComparator getComparator() {
		 return new LnameComparator();
	 }
	 // Task C
	private void mySort(Person[] col) {
		// Declare a class inside the method is Local class
	
		class NameComparator implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
				
				// TODO Auto-generated method stub
				return o2.getFname().compareTo(o1.getFname());
			}
			
		}
		Arrays.sort(col,new NameComparator());
		System.out.println("Sort by first name -Reversed using Local Innerclass comparator");
		for(Person p: col) {
			System.out.println(p);
		}
	}
}
