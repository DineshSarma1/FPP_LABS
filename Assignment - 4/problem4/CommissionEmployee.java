package fifthclass.assignments.problem4;

public class CommissionEmployee extends Employee{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPayment() {
		
		return (grossSales * commissionRate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public String toString() {
		String status = "First Name : "+ super.getFirstName() + 
				" Last Name : " + super.getLastName() + 
				" SSN : " + super.getSocialSecurityNumber() + 
				" Gross sales : " + grossSales + 
				" Commission Rate : " + commissionRate;
		
		return status;
	}

}
