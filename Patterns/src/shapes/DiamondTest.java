package shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiamondTest {
	Diamond d = new Diamond();

	@Test
	void testfor2() {
		assertEquals("   *\n  ***\n *****\n  ***\n   *\n", d.getShape(3));
	}

	@Test
	void testfor5() {
		assertEquals("     *\n    ***\n   *****\n  *******\n *********\n  *******\n   *****\n    ***\n     *\n",
				d.getShape(5));
	}

}
