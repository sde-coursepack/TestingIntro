package edu.virginia.cs.testingintro;

public class NumberChanges {
    private int number;
    private int timesChanged;

    public NumberChanges(int number, int pastChanges) {
        this.number = number;
        this.timesChanged = pastChanges;
    }

    public NumberChanges(int x) {
        this(x, 0);
    }

    public void setNumber(int newNumber) {
        if (number == newNumber) {
            return;
        }
        this.number = newNumber;
        this.timesChanged++;
    }

    public int getNumber() {
        return number;
    }

    public int getTimesChanged() {
        return timesChanged;
    }
}
