import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompoundInterestAldianoTest {

	@Test
	void test() {
		double expected = 1141.17;
		double actual = CompoundInterestAldiano.computeBalance(1000, .045, 3);
		double delta = 0.01;
		assertEquals(expected, actual, delta); 
	}

	@Test
	void test1() {
		double expected = 2318.55;
		double actual = CompoundInterestAldiano.computeBalance(2000, .03, 5);
		double delta = 0.01;
		assertEquals(expected, actual, delta); 
	}
	
	@Test
	void test2() {
		double expected = 3313.87;
		double actual = CompoundInterestAldiano.computeBalance(3000, .01, 10);
		double delta = 0.01;
		assertEquals(expected, actual, delta); 
	}
}
