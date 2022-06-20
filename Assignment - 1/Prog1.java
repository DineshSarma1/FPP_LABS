package firstclass.hw;


public class Prog1 {
	public static void main(String[] args) {
		//Declaring variable x
		int x;
		
		//initializing x with a random number between 1 to 9
		x = RandomNumbers.getRandomInt(1, 9);
		
		//displaying generated random number
		System.out.print("\ngenerated random number is : " + x + "\n");
		
		//calculating and printing output to the console
		System.out.println("value of pi^" + x + " is : " + Math.pow(Math.PI, x) + "\n\n");
		
		//Declaring variable y
		int y;
		
		//initializing y with a random number between 3 to 14
		y = RandomNumbers.getRandomInt(3, 14);
		
		//displaying generated random number
		System.out.print("generated random number is : " + y + "\n");
		
		//calculating and printing output to the console
		System.out.print("value of " + y + "^pi is : " + Math.pow(y, Math.PI));
	}
}
