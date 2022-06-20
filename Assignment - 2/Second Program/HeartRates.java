package secondclass.secondprogram;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {

	private String firstName;
	private String lastName;
	private String dob;
	
	private static final String  DATE_PATTERN = "yyyy-MM-dd";
	private final int RHR = 70;
	private final float LB = 0.5f;
	private final float UB = 0.85f;
	private int MHR;
	private int AHR;
	private float LBTHR;
	private float UBTHR;
	
	public HeartRates(String firstName, String lastName, String dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.MHR = calculateMaximumHeartRate();
		this.AHR = calculateAverageHeartRate();
		this.LBTHR = calculateLBTHR();
		this.UBTHR = calculateUBTHR();
	}
	
	public int calculatePersonAge() {
		
		LocalDate localDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern(DATE_PATTERN));
		AgeCalculator ageCalculator = new AgeCalculator();
		Period agePeriod = ageCalculator.calculateAge(localDate);
		//String age = agePeriod.getYears()+" years, "+ agePeriod.getMonths() +" months\"\r\n"+ "+ \" and "+ agePeriod.getDays() +" days old%n";
		
		return agePeriod.getYears();
	}
	
	public int calculateMaximumHeartRate() {
		
		return (220-calculatePersonAge());
	}
	
	public int calculateAverageHeartRate() {
		return (this.MHR - this.RHR);
	}
	
	public String pringPersonTargetHeartRateRange() {
		return "The Target Heart Rate Range is Between " + LBTHR + " and " + UBTHR + 
				"\nFirst Name : " + firstName + 
				"\nLast Name : " + lastName + 
				"\nAge : " + calculatePersonAge() + 
				"\nDate of Birth : " + dob + 
				"\nMaximum Heart Rate : " + MHR;
	}
	
	public float calculateLBTHR() {
		// (AHR*LB) + RHR
		return (float) (Math.round((AHR*LB) + RHR));
	}
	
	public float calculateUBTHR() {
		//(AHR*UB) + RHR
		return (float) (Math.round((AHR*UB)+RHR));
	}
	
	
	@Override
	public String toString() {
		return "";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}