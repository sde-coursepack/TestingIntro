package edu.virginia.cs.testingintro;

/**
 * Special thanks to Christian Murphy at Bryn Mawr College for this example
 */

public class FinancialRecord {
	public double calculateBill(int courses, double overdue, boolean exempt) {
		double total = 0;
		if (courses < 3) {
			total = 8000 * courses;
		} else if (courses >= 3 && courses <= 6) {
			total = 6000 * courses;
		} else {
			total = 5500 * courses;
		}
		if (overdue <= 2000 && exempt) {
			return total + overdue;
		} else if (overdue > 2000) {
			if (exempt) {
				return overdue * 1.1 + total;
			} else {
				return (total + overdue) * 1.1;
			}
		} else {
			return total + overdue * 1.1;
		}
	}
} 

