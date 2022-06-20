package fifthclass.assignments.problem4;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	
	@Override
	public double getPayment() {
		
		return (wage * hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		String status = "First Name : "+ super.getFirstName() + 
				" Last Name : " + super.getLastName() + 
				" SSN : " + super.getSocialSecurityNumber() + 
				" Wage : " + wage + 
				" Hours : " + hours;
		
		return status;
	}

}
