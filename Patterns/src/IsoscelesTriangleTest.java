import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IsoscelesTriangleTest {
	IsoscelesTriangle it = new IsoscelesTriangle();

	@Test
	void testForTwo() {
		assertEquals(" *\n***\n", it.getShape(2));
	}

	@Test
	void testForFive() {
		assertEquals("    *\n   ***\n  *****\n *******\n*********\n", it.getShape(5));
	}

	@Test
	void testForException() {
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> it.getShape(5, 6));
		assertEquals("1 Argument is enough for this shape", ex.getMessage());
	}
}