package hwsort.taska;

import java.util.Comparator;

public class NameComparator implements Comparator<DeptEmployee>{
	
	@Override
	public int compare(DeptEmployee de, DeptEmployee de1) {
		return de.getName().compareTo(de1.getName());
	}


}
