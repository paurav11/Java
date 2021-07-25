package Basics.Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = (int)(Math.random()*(10-1) + 1);
        int b = (int)(Math.random()*(10-1) + 1);
        System.out.println("a = " + a + ", b = " + b);

        // Greater than operator
        if (a>b) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("a is not greater than b.");
        }

        int c = (int)(Math.random()*(10-1) + 1);
        int d = (int)(Math.random()*(10-1) + 1);
        System.out.println("c = " + c + ", d = " + d);
        // Greater than or equal to operator
        if (c>=d) {
            System.out.println("c is greater than or equal to d.");
        } else {
            System.out.println("c is not greater than or equal to d.");
        }

        int e = (int)(Math.random()*(10-1) + 1);
        int f = (int)(Math.random()*(10-1) + 1);
        System.out.println("e = " + e + ", f = " + f);
        // Lesser than operator
        if (e<f) {
            System.out.println("e is less than f.");
        } else {
            System.out.println("e is not less than f.");
        }

        int g = (int)(Math.random()*(10-1) + 1);
        int h = (int)(Math.random()*(10-1) + 1);
        System.out.println("g = " + g + ", h = " + h);
        // Lesser than or equal to operator
        if (g<=h) {
            System.out.println("g is less than or equal to h.");
        } else {
            System.out.println("g is not less than or equal to h.");
        }

        int i = (int)(Math.random()*(10-1) + 1);
        int j = (int)(Math.random()*(10-1) + 1);
        System.out.println("i = " + i + ", j = " + j);
        // Equal to operator
        if (i==j) {
            System.out.println("i is equal to j.");
        } else {
            System.out.println("i is not equal to j.");
        }

        int k = (int)(Math.random()*(10-1) + 1);
        int l = (int)(Math.random()*(10-1) + 1);
        System.out.println("k = " + k + ", l = " + l);
        // Not equal to operator
        if (k!=l) {
            System.out.println("k is not equal to l.");
        } else {
            System.out.println("k is equal to l.");
        }
    }
}
