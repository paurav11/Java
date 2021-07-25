package Basics.Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Operators are used to perform different operations in Java
        int num1 = 17;
        System.out.println(num1);
        System.out.println(num1++); // Post-increment operator
        System.out.println(num1--); // Post-decrement operator
        System.out.println(++num1); // Pre-increment operator
        System.out.println(--num1); // Pre-decrement operator

        int num2 = 22;
        System.out.println(num1++ + num2--);
        System.out.println(++num1 + --num2);
        System.out.println(num1++ - num2--);
        System.out.println(++num1 - --num2);

        int num10 = +5; // Unary plus operator
        int num11 = -6; // Unary minus operator
        int num12 = num10 + num11;
        System.out.println(num12);

        // Unary complement operator (Binary one's complement)
        System.out.println(~num10);
        System.out.println(~num11);
    }
}
