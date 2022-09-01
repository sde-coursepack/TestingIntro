package edu.virginia.cs.testingintro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;


public class FinancialRecordTest {
	private static final double tolerance = 1e-4; //if answer is within .01 cents, we're happy
	private FinancialRecord fr;

	@BeforeEach
	public void setup()	{
		fr = new FinancialRecord();
	}

	@Test
	public void testCalculateBill_LowCourse_BigOverdue_NoExempt() {
		assertEquals(20350, fr.calculateBill(2, 2500, false), tolerance);
	}
	
	@Test
	public void testCalculateBill_MidCourse_SmallOverdue_YesExempt() {
		assertEquals(31500, fr.calculateBill(5, 1500, true), tolerance);
	}

	@Test
	public void testCalculateBill_HighCourse_BigOverdue_NoExempt() {
		assertEquals(51150, fr.calculateBill(8, 2500, false), tolerance);
	}

	@Test
	public void testCalculateBill_MidCourse_SmallOverdue_NoExempt() {
		assertEquals(31650, fr.calculateBill(5, 1500, false), tolerance);
	}

	@Test
	public void testCalculateBill_MidCourse_BigOverdue_YesExempt() {
		assertEquals(35500, fr.calculateBill(5, 2500, true), tolerance);
	}
}
