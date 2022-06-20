package fifthclass.assignments.problem1;

public class Prob1TestMain {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Rectangle("Red",4,5);
		shapes[1] = new Circle("Yello",5);
		shapes[2] = new Rectangle("Black",8,4);
		shapes[3] = new Square("Red",33);
		shapes[4] = new Circle("Red",7);
		
		printTotal(shapes);

	}
	
	public static void printTotal(Shape[] shapes) {
		for(Shape shape : shapes) {
			System.out.println("Area of " + shape.getClass().getSimpleName() + " : " +shape.calculateArea() + 
					"\nPerimeter of " + shape.getClass().getSimpleName() + " : " +shape.calculatePerimeter());
		}
	}

}
