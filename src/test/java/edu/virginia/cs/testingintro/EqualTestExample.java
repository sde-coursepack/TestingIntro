package edu.virginia.cs.testingintro;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EqualTestExample {
    @Test
    public void stringTest() {
        String a="Will ";
        a += "McBurney";
        String b="Will McBurney";
        assertEquals(a,b);
    }

    @Test
    public void arrayTestFail() {
        String[] a = {"Will", "McBurney"};
        String[] b = new String[2];
        b[0] = "Will";
        b[1] = "McBurney";
        assertEquals(a, b);
    }

    @Test
    public void arrayTestPass() {
        String[] a = {"Will", "McBurney"};
        String[] b = new String[2];
        b[0] = "Will";
        b[1] = "McBurney";
        assertArrayEquals(a, b);
    }

    @Test
    public void doubleTestFail() {
        double a = 2.0;
        double rootA = Math.sqrt(a);
        double b = rootA * rootA;
        assertEquals(a, b);
    }

    @Test
    public void doubleTestPass() {
        double a = 2.0;
        double rootA = Math.sqrt(a);
        double b = rootA * rootA;
        assertEquals(a, b, 1e-9);
    }
}
