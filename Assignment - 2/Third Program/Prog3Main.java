package secondclass.thirdprogram;

import java.util.Scanner;

public class Prog3Main {

	public static void main(String[] args) {
		
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		
		Scanner sc = new Scanner(System.in);
		String userChoice = sc.nextLine();
		
		if(userChoice.equalsIgnoreCase("C")) {
			System.out.println("Enter the Radius of the Circle");
			double radius = sc.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println("The area of Circle is :" + circle.computeArea());
		} else if (userChoice.equalsIgnoreCase("R")) {
			System.out.println("Enter the width of the Rectangle");
			double width = sc.nextDouble();
			
			System.out.println("Enter the height of the Rectangle");
			double height = sc.nextDouble();
			
			Rectangle rectangle = new Rectangle(height,width);
			System.out.println("The area of Rectangle is :" + rectangle.computeArea());
			
		}else if (userChoice.equalsIgnoreCase("T")) {
			System.out.println("Enter the base of the Triangle");
			double base = sc.nextDouble();
			
			System.out.println("Enter the height of the Triangle");
			double height = sc.nextDouble();
			
			Triangle rectangle = new Triangle(base,height);
			System.out.println("The area of Triangle is :" + rectangle.computeArea());
		}else {
			System.out.println("Invalid option!");
		}
		
		sc.close();

	}

}
