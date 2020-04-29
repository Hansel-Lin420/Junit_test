package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	void test() {
		CountA c = new CountA();
		int output = c.CountAMethod("Alphabet");
		assertEquals(2,output);
	}

}
