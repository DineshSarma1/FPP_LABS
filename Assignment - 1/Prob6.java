package firstclass.hw;

public class Prob6 {

	public static void main(String[] args) {
		int[] numbers = {2,-21,3,45,0,12,18,6,3,1,0,-22};
		
		int smallestNumber = numbers[0];
		
		for(int i = 1; i < numbers.length - 1; i++) {
			if(smallestNumber > numbers[i+1]) {
				smallestNumber = numbers[i+1];
			}
		}
		
		System.out.println("smallest number is : "+smallestNumber);

	}

}
