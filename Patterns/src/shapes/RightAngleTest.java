package shapes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RightAngleTest {
	RightAngle rh = new RightAngle();

	@Test
	void testForTwo() {
		assertEquals("*\n**\n",rh.getShape(2));
	}
	
	@Test
	void testForFive() {
		assertEquals("*\n**\n***\n****\n*****\n",rh.getShape(5));
	}

	@Test
	void testForEight() {
		assertEquals("*\n**\n***\n****\n*****\n******\n*******\n********\n",rh.getShape(8));
	}
}
