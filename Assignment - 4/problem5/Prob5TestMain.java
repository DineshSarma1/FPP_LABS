package fifthclass.assignments.problem5;

public class Prob5TestMain {

	public static void main(String[] a) {
		Computer comp1 = new Computer("Dell","i7", 8 , 2.4);
		
		Computer comp2 = new Computer("Dell","i7", 8 , 2.4);
		
		if(comp1.equals(comp2)) {
			System.out.println("Same!");
			System.out.println(comp1.toString());
			
		}else {
			System.out.println("Different!");
			System.out.println(comp1.toString());
			System.out.println(comp2.toString());
		}
	}
}
