package Basics.Operators;

public class ShiftOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        System.out.println(a<<2); // Left shift operator --> 10 << 2 = 10*2^2 = 40
        System.out.println(a<<3); // Left shift operator --> 10 << 3 = 10*2^3 = 80
        System.out.println(b>>3); // Right shift operator --> 25 >> 3 = 25/2^3 = 3 (nearest value)
        System.out.println(b>>2); // Right shift operator --> 25 >> 2 = 25/2^2 = 6 (nearest value)

        // >>> operator
        System.out.println(b>>>2); // Works the same as >>, but only for positive number
        int c = -10;
        System.out.println(c>>2); // -10 >> 2 = -10/2^2 = -3 (nearest value)
        System.out.println(c>>>2); // For negative number, >>> changes parity bit (MSB) to 0
    }
}
