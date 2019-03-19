import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionTest {

	@Test
	void testFindCost() {
		Construction c=new Construction();
		
		assertEquals(1200,c.findCost("standard", 1));
		assertEquals(3000,c.findCost("above standard", 2));
		assertEquals(5400,c.findCost("high standard", 3));
		assertEquals(10000,c.findCost("high standard with automation", 4));
	}

}
