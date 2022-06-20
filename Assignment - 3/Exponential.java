package assignmentfour;

public class Exponential {
	
	public static double power(double x, int n) {
		if(n == 0) {
			return 1;
		}else if(x == 0) {
			return 0;
		}else {
	        return (x * power(x,n-1));
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,10));	}
}
