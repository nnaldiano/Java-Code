import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SayThankYouTest2 {

	@Test
	void test() {
		assertEquals("Thanks, Mac!", SayThankYou.sayThanks("Mac"));
	}
	
	@Test
	void test2() {
		assertEquals("Thanks, Mac Miller!", SayThankYou.sayThanks("Mac", "Miller"));
	}
	
	@Test
	void test3() {
		assertEquals("Thanks, Mac Dennis Miller!", SayThankYou.sayThanks("Mac", "Dennis", "Miller"));
	}

}
