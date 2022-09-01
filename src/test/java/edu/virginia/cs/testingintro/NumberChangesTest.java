package edu.virginia.cs.testingintro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberChangesTest {
    @Test
    @DisplayName("Testing initial state after constructor call")
    void testInit() {
        NumberChanges n = new NumberChanges(5);
        assertEquals(5, n.getNumber());
        assertEquals(0, n.getTimesChanged());
    }

    @Test
    void testSetNumberChanged() {
        NumberChanges n = new NumberChanges(5);
        n.setNumber(7);
        assertEquals(7, n.getNumber());
        assertEquals(1, n.getTimesChanged());
    }

    @Test
    void testSetNumberUnchanged() {
        NumberChanges n = new NumberChanges(5);
        n.setNumber(5);
        assertEquals(5, n.getNumber());
        assertEquals(0, n.getTimesChanged());
    }
}

