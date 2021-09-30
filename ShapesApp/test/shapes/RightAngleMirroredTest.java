package shapes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RightAngleMirroredTest {
	RightAngleMirrored ram = new RightAngleMirrored();

	@Test
	void testForTwo() {
		assertEquals(" *\n**\n",ram.getShape(2));
	}
	
	@Test
	void testForFive() {
		assertEquals("    *\n   **\n  ***\n ****\n*****\n",ram.getShape(5));
	}

	@Test
	void testForEight() {
		assertEquals("       *\n      **\n     ***\n    ****\n   *****\n  ******\n *******\n********\n",ram.getShape(8));
	}

}
