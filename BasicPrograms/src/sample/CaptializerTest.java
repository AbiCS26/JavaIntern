package sample;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CaptializerTest {
	Capitalizer c = new Capitalizer();

	@Test
	void testForAbi() {
		assertEquals("Abi", c.capitalize("abi"));
	}

	@Test
	void testForString() {
		assertEquals("Jklmn", c.capitalize("jklmn"));
	}

	@Test
	void testForStringWithCapitalLettersInside() {
		assertEquals("AbCDeF", c.capitalize("abCDeF"));
	}

	@Test
	void testForEmptyString() {
		assertEquals(" ", c.capitalize(" "));
	}

	@Test
	void testForNullString() {
		assertThrows(NullPointerException.class, () -> c.capitalize(null));

	}

	@Test
	void testForSingleChar() {
		assertEquals("A", c.capitalize("a"));
	}
}
