package lab12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1Solution {

	public static void main(String[] args) {

		// initializing scanner object
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the score in the range 0 - 100");

		try {
			int score = scanner.nextInt();
			if (score >= 0 && score <= 100)
				System.out.println("Input Score : " + score);
			else
				throw new UnsupportedOperationException();

		} catch (InputMismatchException ex) {
			System.out.println("Input Mismatch...");

		} catch (UnsupportedOperationException ex) {
			System.out.println("Input should be in the range of 0 - 100");
		}

		finally {
			scanner.close();
		}
	}
}
