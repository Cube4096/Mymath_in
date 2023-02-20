package mymath_in;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class mymath_test {
	


	@Test
	void sqrttest() {
		int a = 3;
		int b = 4;
		int c2 = a * a + b * b;
		int c = mymath.sqrt(c2);
		assert c == 5;
	}
	
	@Test
	void binarySearchTest() {
		int[] xs = {10, 20, 30, 40};
		assertEquals(1, mymath.binarySearch(xs, 15));
		assertEquals(2, mymath.binarySearch(xs, 30));
	}
}
