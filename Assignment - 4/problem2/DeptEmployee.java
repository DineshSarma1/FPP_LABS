package fifthclass.assignments.problem2;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}

}
