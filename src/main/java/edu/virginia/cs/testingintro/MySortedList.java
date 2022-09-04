package edu.virginia.cs.testingintro;

import java.util.*;

public class MySortedList {
    private final ArrayList<Integer> mySortedList;
    private boolean isSorted;

    public MySortedList(ArrayList<Integer> starterList) {
        mySortedList = starterList;
        isSorted = false;
    }

    public MySortedList() {
        this(new ArrayList<>());
    }

    public boolean isEmpty() {
        return mySortedList.isEmpty();
    }

    public void add(int toAdd) {
        mySortedList.add(toAdd);
        isSorted = false;
    }

    public int get(int index) {
        if (!isSorted) {
            sortList();
        }
        return mySortedList.get(index);
    }

    public int size() {
        return mySortedList.size();
    }

    public String toString() {
        if (!isSorted) {
            sortList();
        }
        return mySortedList.toString();
    }

    private void sortList() {
        Collections.sort(mySortedList);
        isSorted = true;
    }
}
