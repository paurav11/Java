package Basics.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator is a kind of 1-line comparison operator
        int x = (int)(Math.random()*(15-1) + 1);
        int y = (int)(Math.random()*(15-1) + 1);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        String result = x>y? "x is greater than y." : "y is greater than x.";
        System.out.println(result);
    }
}
