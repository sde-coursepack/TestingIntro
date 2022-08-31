package edu.virginia.cs.testingintro;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MaxFunctionsTest {
    @Test
    @DisplayName("Testing 3-argument max with 3, 2, 1")
    public void testMaxDescendingArguments() {
        // input
        int a = 3, b = 2, c = 1;
        //expected output
        int expected = 3;
        //actual output
        int actual = MaxFunctions.max(a, b, c);
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 3-argument max with 1, 2, 3")
    public void testMaxAscendingArguments() {
        // input
        int a = 1, b = 2, c = 3;
        //expected output
        int expected = 3;
        //actual output
        int actual = MaxFunctions.max(a, b, c);
        //assertion
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 3-argument max with 3, 2, 1")
    public void testMaxEqualArguments() {
        // input
        int a = 3, b = 3, c = 3;
        //expected output
        int expected = 3;
        //actual output
        int actual = MaxFunctions.max(a, b, c);
        //assertion
        assertEquals(expected, actual);
    }
}