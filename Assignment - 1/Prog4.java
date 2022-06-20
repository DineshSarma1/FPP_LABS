package firstclass.hw;

public class Prog4 {

	public static void main(String[] args) {
		float f1 = 1.27f, f2 = 3.881f, f3 = 9.6f;
		
		int sum1 = (int)(f1 + f2 + f3);
		int sum2 = (int) (Math.round(f1 + f2 + f3));
		
		System.out.println("sum after casting : "+sum1);
		System.out.println("sum after using round method : "+sum2);

	}

}
