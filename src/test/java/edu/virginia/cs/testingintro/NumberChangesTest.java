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
    void testSetNumberUnchanged_Number() {
        NumberChanges n = new NumberChanges(5);
        n.setNumber(5);
        assertEquals(5, n.getNumber());
    }

    @Test
    void testSetNumberUnchanged_TimesChanged() {
        NumberChanges n = new NumberChanges(5);
        n.setNumber(5);
        assertEquals(0, n.getTimesChanged());
    }

    @Test
    void testAlreadyChangedSetNumberChanged() {
        //Setup and configure test object
        NumberChanges nc = new NumberChanges(7, 4);

        //run operation to be tested
        nc.setNumber(13);

        //Check to ensure object behaved as specified
        assertEquals(13, nc.getNumber(), "Number did not change to 13 correctly");
        assertEquals(5, nc.getTimesChanged(), "Number of times change did not correctly increment");
    }

    @Test
    void testAlreadyChangedSameNumber() {
        //Setup and configure test object
        NumberChanges nc = new NumberChanges(7, 4);

        //run operation to be tested
        nc.setNumber(7);

        //Check to ensure object behaved as specified
        assertEquals(7, nc.getNumber(), "Number changed when it should have stayed 7");
        assertEquals(4, nc.getTimesChanged(), "Number of times changed when it shouldn't have");
    }
}

