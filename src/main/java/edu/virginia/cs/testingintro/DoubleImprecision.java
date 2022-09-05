package edu.virginia.cs.testingintro;

public class DoubleImprecision {
    public static void main(String[] args) {
        double x = 0.0;
        int n = 10;
        while (n > 0) {
            n--;
            x += 0.1;
        }
        System.out.println("x = " + x); //doesn't print 1.0
    }
}
