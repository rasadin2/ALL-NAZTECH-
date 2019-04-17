package mbl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mbl_test {

	@Test
	void test() {
		Mbl mbl1 = new Mbl();
		assertEquals("yes", mbl1.mbl());
	}

}
