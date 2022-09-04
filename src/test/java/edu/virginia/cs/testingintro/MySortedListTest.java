package edu.virginia.cs.testingintro;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MySortedListTest {

    @Test
    void isEmptyTestInitiallyTrue() {
        MySortedList myList = new MySortedList();
        assertTrue(myList.isEmpty());
    }

    @Test
    void isEmptyTestInitiallyFalse() {
        ArrayList<Integer> starterList = new ArrayList<>();
        starterList.add(1);
        MySortedList myList = new MySortedList(starterList);
        assertFalse(myList.isEmpty());
        assertEquals(1, myList.size());
    }

    @Test
    void addValueToMiddle() {
        //create starter List
        ArrayList<Integer> starterList = new ArrayList<>();
        starterList.add(1);
        starterList.add(3);
        starterList.add(5);

        MySortedList myList = new MySortedList(starterList);
        myList.add(4); //should be added between 3 and 5

        assertEquals(4, myList.size(), "Incorrect size of list");
        assertEquals(4, myList.get(2), "4 not added at the correct index");
        assertEquals(3, myList.get(1), "3 not immediately before 4");
        assertEquals(5, myList.get(3), "5 not immediately after 4");
    }

    @Test
    void get() {
    }

    @Test
    void size() {
    }
}