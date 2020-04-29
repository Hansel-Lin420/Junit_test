package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void square_test() {
		Square s = new Square();
		int output = s.SquareMethod(5);
		assertEquals(25,output);
		
	}

}
