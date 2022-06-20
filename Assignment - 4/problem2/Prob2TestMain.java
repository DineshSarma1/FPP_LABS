package fifthclass.assignments.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Prob2TestMain {

	public static void main(String[] args) {
		
		Professor p1 = new Professor("Nirmal", 100000, LocalDate.of(2018,5,23));
		Professor p2 = new Professor("Binod", 50000, LocalDate.of(2021,3,2));
		Professor p3 = new Professor("Khadanand", 80000, LocalDate.of(2020,6,1));
		
		Secretary s1 = new Secretary("Aashis", 30000, LocalDate.of(2019,1,1));
		Secretary s2 = new Secretary("Purushottam", 40000, LocalDate.of(2018,8,1));
		
		DeptEmployee[] deptEmployee = new DeptEmployee[5];
		deptEmployee[0] = p1;
		deptEmployee[1] = p2;
		deptEmployee[2] = p3;
		deptEmployee[3] = s1;
		deptEmployee[4] = s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wishes to see the sum of all Professor and Secretary (Y/N)?");
		String userChoice = sc.next();
		sc.close();
		
		if(userChoice.equalsIgnoreCase("y")) {
			double sumOfSalary = 0.0;
			for(DeptEmployee emp : deptEmployee) {
				sumOfSalary = sumOfSalary + emp.computeSalary();
			}
			
			System.out.println("Sum of salary : " + sumOfSalary);
			
		}else {
			System.out.println("See you next time!");
		}
	}

}
