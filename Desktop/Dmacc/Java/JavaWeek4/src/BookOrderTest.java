import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookOrderTest {

	@Test
	void testMain() {
		int expectedValue = 5;
		double actualValue = 19;
		assertEquals(expectedValue, actualValue);
		
	}

	@Test
	void testShippingTax() {
		int expectedValue = 5;
		int acualValue = 6;
		assertEquals(expectedValue,acualValue);
	}

}
