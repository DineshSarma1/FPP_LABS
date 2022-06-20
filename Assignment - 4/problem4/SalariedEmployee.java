package fifthclass.assignments.problem4;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPayment() {
		return this.weeklySalary;
	}
	
	@Override
	public String toString() {
		String status = "First Name : "+ super.getFirstName() + 
				" Last Name : " + super.getLastName() + 
				" SSN : " + super.getSocialSecurityNumber() +  
				" Weekly salary : " + weeklySalary;
		
		return status;
	}

}
