package edu.virginia.cs.testingintro;

import java.util.List;

/**
 * Special thanks to Christian Murphy at Bryn Mawr College for this example
 */

public class StudentFinancialRecord {
	private final int studentID;
	private int classYear;
	private double overdue;
	private boolean isExempt;

	public StudentFinancialRecord(int studentID) {
		this.studentID = studentID;
		this.classYear = 1;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public void setOverdue(double overdue) {
		this.overdue = overdue;
	}

	public void setExempt(boolean isExempt) {
		this.isExempt = isExempt;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getClassYear() {
		return classYear;
	}

	public double getOverdue() {
		return overdue;
	}

	public boolean isExempt() {
		return isExempt;
	}

	public double calculateBill(int courses) {
		double total = 0;
		if (courses < 3) {
			total = 8000 * courses;
		} else if (courses >= 3 && courses <= 6) {
			total = 6000 * courses;
		} else {
			total = 5500 * courses;
		}
		if (overdue <= 2000 && isExempt) {
			return total + overdue;
		} else if (overdue > 2000) {
			if (isExempt) {
				total *= 1.1;
				return overdue  + total;
			} else {
				overdue *= 1.1;
				total *= 1.1;
				return total + overdue;
			}
		} else {
			overdue *= 1.1;
			return total + overdue;
		}
	}
} 

