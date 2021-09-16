package sample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class StackTest {
	MyStack stack = new MyStack();

	@Test
	void newStackIsEmpty() {
		assertTrue(stack.isEmpty());
	}

	@Test
	void afterOnePush_isNotEmpty() {
		stack.push(0);
		assertFalse(stack.isEmpty());
	}

}
