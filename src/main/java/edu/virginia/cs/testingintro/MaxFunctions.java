package edu.virginia.cs.testingintro;

public class MaxFunctions {
    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) { return a; }
            else { return c; }
        } else {
            if (b > c) { return b; }
            else { return a; }
        }
    }

    public static int max(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        int x = 1500000000;
        int y = 1000000000;

        System.out.println(max(x, y));
    }
}
