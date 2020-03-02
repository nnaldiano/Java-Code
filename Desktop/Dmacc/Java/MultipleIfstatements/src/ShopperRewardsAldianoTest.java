 import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShopperRewardsAldianoTest {

	@Test
	void testCouponDiscount() {
		double expected = 11.01;
		assertEquals(expected, ShopperRewardsAldiano.couponDiscount(expected) );
	}

	@Test
	void testGasReward() {
		int expected = 11;
		assertEquals(expected, ShopperRewardsAldiano.gasReward(expected));
	}

}
