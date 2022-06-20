package fifthclass.assignments.problem4;

public class Prob4TestMain {
	
	public static void main(String[] a) {
		Employee[] emp = new Employee[5];
		
		emp[0] = new CommissionEmployee("Nirmal", "Silwal", "1231234", 34, 12.5);
		emp[1] = new CommissionEmployee("Binod", "Silwal", "1231234", 10, 15);
		emp[2] = new HourlyEmployee("Khadanand", "Silwal", "1231234", 5000, 4);
		emp[3] = new SalariedEmployee("Aanand", "Silwal", "1231234", 34000);
		emp[4] = new BasePlusCommisionEmployee("Redit", "Silwal", "1231234", 34, 12.5, 50000);
		//CommissionEmployee ce = new BasePlusCommisionEmployee("Nirmal", "Silwal", "1231234", 34, 12.5, 50000);
		//emp[4] = ce;
		
		double totalSalary = 0;
		for(Employee e : emp) {
			
			totalSalary = totalSalary + e.getPayment();
			System.out.println(e.toString());
		}
		
		System.out.println("Total salary : "+totalSalary);
	}

}
