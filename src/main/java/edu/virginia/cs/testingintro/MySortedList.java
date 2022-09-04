package edu.virginia.cs.testingintro;

import java.util.*;

public class MySortedList {
    private ArrayList<Integer> mySortedList;

    public MySortedList(ArrayList<Integer> starterList) {
        mySortedList = starterList;
        Collections.sort(mySortedList);
    }

    public MySortedList() {
        this(new ArrayList<>());
    }

    public boolean isEmpty() {
        return mySortedList.isEmpty();
    }

    public void add(int toAdd) {
        mySortedList.add(toAdd);
        Collections.sort(mySortedList);
    }

    public int get(int index) {
        return mySortedList.get(index);
    }

    public int size() {
        return mySortedList.size();
    }
}
