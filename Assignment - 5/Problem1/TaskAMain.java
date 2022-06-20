package hwsort.taska;

import java.util.Arrays;

public class TaskAMain {
	
	public static void main(String[] a) {
	
		//fetching data
		DeptEmployee[] data = DeptEmployeeData.getDeptData();
	
		NameComparator nc = new NameComparator();
		Arrays.sort(data,nc);
		
		for(DeptEmployee e : data) {
			System.out.println(e);
		}
	}
	
}
