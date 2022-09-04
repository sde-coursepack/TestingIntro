package edu.virginia.cs.testingintro;

public class MaxFunctions {
    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
            else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            }
            else {
                return a;  // should be return c
            }
        }
    }

    public static long max(long a, long b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        long actual = max(1200000000, 3);
        System.out.println(actual + " - should be 1200000000");
    }
}
