package assignmentfour;

public class MinimumCharacter {
	public static char minChar = 'z';

	public static char findMinimumCharacter (String input) {
		
		if(input == null || input == "") {
			return minChar;
		}else {
			if(minChar > input.charAt(0)) {
				minChar = input.charAt(0);
			}
			
			return findMinimumCharacter(input.substring(1));	
		}
		
	}
}
