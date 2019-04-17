package email;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidatorTest {

	@Test
	void test() {
		EmailValidator ob1= new EmailValidator();
		assertEquals("success", ob1.validate());
	}

}
