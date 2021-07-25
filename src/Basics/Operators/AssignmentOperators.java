package Basics.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        // Assignment operator
        int  a = 10;
        float b = 15f;
        double c = 16;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Shorthand assignment operators
        a += 5;
        b *= 10f;
        c /= 2;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        a -= 10;
        b %= 5f;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
