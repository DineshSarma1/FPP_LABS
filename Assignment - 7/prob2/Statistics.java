package linkedlist.prob2;

import java.util.List;

public class Statistics {
	/**
	 * Polymorphically computes and returns the sum of all the salaries of all the
	 * staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if (aList == null || aList.size() == 0)
			return 0.0;

		double sum = 0.0;
		for (EmployeeData ed : aList) {
			sum = sum + ed.getSalary();
		}

		return sum;
		// implement
		// compute sum of all salaries of people in aList and return
	}
}
