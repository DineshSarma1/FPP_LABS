package assignmentfour.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import assignmentfour.Exponential;
import assignmentfour.MinimumCharacter;

class Prog1Test {
	
	//Exponential exp = new Exponential();

	//program 1 testing
	@Test
	void test() {
		double computedPower = Exponential.power(2, 10);
		double eResult = 1024;
		assertEquals(computedPower,eResult,0.0);
	}
	
	//program 2 testing
	@Test
	void test1() {
		char input = MinimumCharacter.findMinimumCharacter("akel")
		char eResult = 'a';
		assertEquals(input,eResult);
	}

}
