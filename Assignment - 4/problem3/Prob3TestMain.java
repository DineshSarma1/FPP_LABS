package fifthclass.assignments.problem3;

public class Prob3TestMain {

	public static void main(String[] args) {
		Figure[] figures = new Figure[5];
		figures[0] = new UpwardHat();
		figures[1] = new UpwardHat();
		figures[2] = new DownwardHat();
		figures[3] = new FaceMaker();
		figures[4] = new Vertical();
		
		for(Figure f : figures) {
			f.getFigure();
		}
		
		for(Figure f : figures) {
			System.out.print("\n" + f.getClass().getSimpleName() + ": ");
			f.getFigure();
		}
		

	}

}
