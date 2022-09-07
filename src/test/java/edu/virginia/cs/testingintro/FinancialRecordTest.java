package edu.virginia.cs.testingintro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;


public class FinancialRecordTest {
	private static final double tolerance = 1e-4; //if answer is within .01 cents, we're happy
	private StudentFinancialRecord record;

	@BeforeEach
	public void setup()	{
		record = new StudentFinancialRecord(1);
	}

	@Test
	public void testCalculateBill_LowCourse_BigOverdue_NoExempt() {
		record.setOverdue(2500);
		record.setExempt(false);
		assertEquals(20350, record.calculateBill(2), tolerance);
		assertEquals(2750, record.getOverdue(), tolerance);
	}
	
	@Test
	public void testCalculateBill_MidCourse_SmallOverdue_YesExempt() {
		record.setOverdue(1500);
		record.setExempt(true);
		assertEquals(31500, record.calculateBill(5), tolerance);
		assertEquals(1500, record.getOverdue(), tolerance);
	}

	@Test
	public void testCalculateBill_HighCourse_BigOverdue_NoExempt() {
		record.setOverdue(2500);
		record.setExempt(false);
		assertEquals(51150, record.calculateBill(8), tolerance);
		assertEquals(2750, record.getOverdue(), tolerance);
	}

	@Test
	public void testCalculateBill_MidCourse_SmallOverdue_NoExempt() {
		record.setOverdue(1500);
		record.setExempt(false);
		assertEquals(31650, record.calculateBill(5), tolerance);
		assertEquals(1650, record.getOverdue(), tolerance);
	}

	@Test
	public void testCalculateBill_MidCourse_BigOverdue_YesExempt() {
		record.setOverdue(2500);
		record.setExempt(true);
		assertEquals(35500, record.calculateBill(5), tolerance);
		assertEquals(2500, record.getOverdue(), tolerance);
	}
}
