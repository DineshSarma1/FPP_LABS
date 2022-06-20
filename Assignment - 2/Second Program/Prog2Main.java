package secondclass.secondprogram;

import java.util.Scanner;

public class Prog2Main {

	public static void main(String[] args) {
		
		System.out.println("Please, enter your first name : ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		
		System.out.println("Please, enter your last name : ");
		String lastName = sc.nextLine();
		
		System.out.println("Please, enter your birth date in the format-(yyy-mm-dd)-Example 1989-4-14 : ");
		String dob = sc.nextLine();
		
		sc.close();
		
		HeartRates heartRates = new HeartRates(firstName,lastName,dob);
		System.out.println(heartRates.pringPersonTargetHeartRateRange());
		

	}

}
