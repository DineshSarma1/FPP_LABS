package fifthclass.assignments.problem4;

public class BasePlusCommisionEmployee extends CommissionEmployee{
	
	double baseSalary;
	
	public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment() {
		return (baseSalary + (super.getGrossSales() * super.getCommissionRate()));
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		String status = "First Name : "+ super.getFirstName() + 
				" Last Name : " + super.getLastName() + 
				" SSN : " + super.getSocialSecurityNumber() + 
				" Base salary : " + baseSalary;
		
		return status;
	}
	
}
