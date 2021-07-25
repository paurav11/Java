package Basics.Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Shift operators are also the bitwise operators

        int a = 15; // 1111 in binary
        int b = 8; // 1000 in binary

        // Bitwise AND operator
        System.out.println(a&b);
        //  1111
        // &1000
        // =1000 = 8 (Decimal)

        // Bitwise Inclusive OR operator
        System.out.println(a|b);
        //  1111
        // |1000
        // =1111 = 15 (Decimal)

        // Bitwise Exclusive OR operator
        System.out.println(a^b);
        //  1111
        // ^1000
        // =0111 = 7 (Decimal)
    }
}
