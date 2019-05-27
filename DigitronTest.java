import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DigitronTest {

	
	Digitron digitron;
	
	@Before
	public void setUp() {
		digitron = new Digitron();
		System.out.println("BEFORE");
		System.out.println("Test addition");
	}
	
	@After
	public void tearDown() {
		System.out.println("AFTER");
	}

	@Test
	public void shouldReturnSumValueOfTwoVariables() {
		double result = digitron.addition(8, 4);
		assertEquals(12, result, 0);
	}
	
	@Test
	public void shouldReturnSubtractionValueOfTwoVariables() {
		double result = digitron.subtraction(8, 4);
		assertEquals(4, result, 0);
	}
	
	@Test
	public void shouldReturnMultiplicationValueOfTwoVariables() {
		double result = digitron.multiplication(8, 4);
		assertEquals(32, result, 0);
	}
	
	@Test
	public void shouldReturnDivisionValueOfTwoVariables() throws Exception {
		double result = digitron.division(8, 4);
		assertEquals(2, result, 0);
	}
	
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void shouldThrowExceptionIfDividedByZero() throws Exception  {
		double result = 1/0;
	}

}


