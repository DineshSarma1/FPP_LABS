package arraylist.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMarketing {

	public static void main(String[] args) {

		List<Marketing> marketingList = new ArrayList<Marketing>();

		// adding items to the array list
		marketingList.add(new Marketing("Nirmal", "Laptop", 1100.80));
		marketingList.add(new Marketing("Binod", "Keyboard", 100.45));
		marketingList.add(new Marketing("Aanand", "Monitor", 1110.91));
		marketingList.add(new Marketing("Luzan", "Pendrive", 5110.56));
		marketingList.add(new Marketing("Rajendra", "Pen", 1111.6));
		marketingList.add(new Marketing("abcd", "Monitor", 110.91));
		marketingList.add(new Marketing("begt", "Pendrive", 50.56));
		marketingList.add(new Marketing("lksjdu", "Pen", 1.6));

		// printing the items
		System.out.println("Original data...");
		System.out.println("Original size : " + marketingList.size());
		for (Marketing m : marketingList) {
			System.out.println(m);
		}

		// removing the items using index
		marketingList.remove(2);

		// printing the items
		System.out.println("After removing one item by index...");
		System.out.println("Original size : " + marketingList.size());
		for (Marketing m : marketingList) {
			System.out.println(m);
		}

		// removing the items using object
		marketingList.remove(new Marketing("Luzan", "Pendrive", 50.56));

		// printing the items
		System.out.println("After removing one item by object...");
		System.out.println("Original size : " + marketingList.size());
		for (Marketing m : marketingList) {
			System.out.println(m);
		}

		// sorting the list
		Comparator<Marketing> salesComp = new SalesComparator();
		Collections.sort(marketingList, salesComp);

		System.out.println("After sorting with respect to sales amount");
		for (Marketing m : marketingList) {
			System.out.println(m);
		}

		// name comparator with sales amount is greater than 1000
		List<Marketing> newMarketingList = listMoreThan1000(marketingList);

		System.out.println("\nAfter sorting with respect to name : \n");
		for (Marketing m : newMarketingList) {
			System.out.println(m);
		}
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> newList = new ArrayList<Marketing>();

		for (Marketing m : list) {
			if (m.getSalesamount() > 1000.0) {
				newList.add(m);
			}
		}

		System.out.println("\nsales person with sales amount is greater than 1000 :");
		for (Marketing m : newList) {
			System.out.println(m);
		}

		// sorting the list
		Comparator<Marketing> nameComp = new NameComparator();
		Collections.sort(newList, nameComp);

		return newList;
	}

	public static class SalesComparator implements Comparator<Marketing> {

		@Override
		public int compare(Marketing m1, Marketing m2) {
			if (Double.compare(m1.getSalesamount(), m2.getSalesamount()) != 0) {
				return Double.compare(m1.getSalesamount(), m2.getSalesamount());

			} else if (m1.getProductname().compareTo(m2.getProductname()) != 0) {
				return m1.getProductname().compareTo(m2.getProductname());
			}
			return m1.getProductname().compareTo(m2.getProductname());
		}
	}

	public static class NameComparator implements Comparator<Marketing> {

		@Override
		public int compare(Marketing m1, Marketing m2) {
			if (m1.getEmployeename().compareTo(m2.getEmployeename()) != 0) {
				return m1.getEmployeename().compareTo(m2.getEmployeename());
			} else if (m1.getProductname().compareTo(m2.getProductname()) != 0) {
				return m1.getProductname().compareTo(m2.getProductname());
			}
			return Double.compare(m1.getSalesamount(), m2.getSalesamount());
		}
	}

}
